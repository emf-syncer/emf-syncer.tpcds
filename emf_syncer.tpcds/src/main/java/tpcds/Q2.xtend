package tpcds;

import java.util.Collection
import java.util.List
import emf_syncer.DAOResolver_JPA_TCPDS
import emf_syncer.Syncer
import emf_syncer.Syncer.SyncingStrategy
import javax.persistence.EntityManager
import org.eclipse.emf.ecore.util.EcoreUtil
import tpcds.domain.lazy.StoreReturns
import tpcds.gen.q1.Customer
import tpcds.gen.q1.Q1Factory
import tpcds.gen.q1.Q1Package
import util.QueryStats

import static extension util.Stats.*

class Q2 {

    EntityManager em;
 
 	var String factor
 	var debug = false
 	var iterations = 1
 	var check_correctness = true 
 	var syncing_strategy = SyncingStrategy.LAZY 
 	var int size_model
	
	val PACKAGE = Q1Package.eINSTANCE
	val FACTORY = Q1Factory.eINSTANCE
	
	new(EntityManager em, String factor, int size_model, boolean debug, int iterations, boolean check_correctness, SyncingStrategy syncing_strategy) {
		this.em = em
		this.factor = factor
		this.debug = debug
		this.iterations = iterations
		this.check_correctness = check_correctness
		this.syncing_strategy = syncing_strategy
		this.size_model = size_model
	}
  
  
    def void runExperiments(List<QueryStats> queryStatsList) {
    	
    	var TCPDSQueries_emf emfQueries
    	var long time
    	var long memory 
    	
    	
    	for (var i=0; i<iterations; i++) {
    		if (i % 10 == 0) println('''iteration «i»''')
    		
    		val queryStats = new QueryStats
    		queryStats.query = 'Q2'
    		queryStats.iteration = i
    		queryStats.factor = if ((factor===null) || (factor=='')) factor='01' 
    		queryStats.syncer_type = syncing_strategy.toString()
	    	
	    	
	    	var Boolean invResultJava
	    	var Boolean invResultEmf
			
			val queriesSQL = new TCPDSQueries_sql(em)
			val sqlInvariantResult = queriesSQL.query2()
			queryStats.time_sqlQuery = queriesSQL.computingTime.toMillis
			queryStats.memory_sqlQuery = queriesSQL.computingMemory.toMBs
			if (debug) {
				println()				
				println ('''Q2 SQL (ms): «queryStats.time_sqlQuery»''')
				println ('''Q2 SQL invariant result: «sqlInvariantResult»''')
			}
	        
	        
			/*
			 * DO FETCHING ONCE as for big databases it can be very slow
			 */
	        time = System.nanoTime()
	        memory = peekMemoryUsage()
	    	val srList = em.createQuery(
					'''SELECT sr FROM StoreReturns sr''', tpcds.domain.lazy.StoreReturns)
				.resultList
			queryStats.time_fetching = since(time).toMillis
			queryStats.memory_fetching = memorySince(memory).toMBs
			if (debug) {
				println()			
				println('''Q2 ORM fetching time (ms): «queryStats.time_fetching»''')
			}
				
	        
	        
			val daoResolver = new DAOResolver_JPA_TCPDS
	
	
	
			var javaQueries = new TCPDSQueries_java(daoResolver)    
			if (check_correctness) {	
		    	invResultJava = javaQueries.query2(srList, sqlInvariantResult) // checks for correctness
		    	queryStats.correct_java1st = javaQueries.correct
		    } else
	    		invResultJava = javaQueries.query2(srList) 
			
			queryStats.time_java1st = javaQueries.computingTime.toMillis
			queryStats.memory_java1st = javaQueries.computingMemory.toMBs
			if (debug) {
				println()				
				println('''Q2 Java (ms): «queryStats.time_java1st»''')
				println ('''Q2 Java invariant result: «invResultJava»''')
			}
			
	
			javaQueries = new TCPDSQueries_java(daoResolver)    
			if (check_correctness) {
		    	invResultJava = javaQueries.query2(srList, sqlInvariantResult) // checks for correctness
				queryStats.correct_java2nd = javaQueries.correct		    	
		    } else
	    		invResultJava = javaQueries.query2(srList) 
			
			queryStats.time_java2nd = javaQueries.computingTime.toMillis
			queryStats.memory_java2nd = javaQueries.computingMemory.toMBs
			if (debug) {
				println()				
				println('''Q2 Java 2nd time (ms): «queryStats.time_java2nd»''')
				println ('''Q2 Java 2nd time invariant result: «invResultJava»''')
			}
			
			
			// without DAO resolver we get duplicate objects
			val syncer = new Syncer(PACKAGE, size_model, daoResolver, #['tpcds.domain.lazy'])
			
	    	if (syncing_strategy == SyncingStrategy.EAGER) 
	    		syncer.syncingStrategy = SyncingStrategy.EAGER
			
			time = System.nanoTime()
			memory = peekMemoryUsage()
	    	val srListEmf = syncer.initialSync(srList).map[it as tpcds.gen.q1.StoreReturns]
	    	queryStats.time_syncer = since(time).toMillis
	    	queryStats.memory_syncer = memorySince(memory).toMBs
	    	if (debug) {
				println()	    		
				println('''Q2 Initial syncing time (ms): «queryStats.time_syncer»''')
			}
			
			
			
			
			
			/*
			 * EMF QUERY AFTER SYNCING
			 */
			
			// objects have been full loaded, the DAO resolver is only needed for syncing
			emfQueries = new TCPDSQueries_emf()
			if (check_correctness) {
	    		invResultEmf = emfQueries.query2(srListEmf, sqlInvariantResult)  // checks for correctness
	    		queryStats.correct_emf1st = emfQueries.correct
	    	} else
	    		invResultEmf = emfQueries.query2(srListEmf)
	    	queryStats.time_emf1st = emfQueries.computingTime.toMillis
	    	queryStats.memory_emf1st = emfQueries.computingMemory.toMBs
	    	// objects used in queries are now loaded in the map
	    	queryStats.size_syncer = syncer.javaToEmfMap.keySet.size 
	    	if (debug) {
				println()	    		
 				println('''Q2 EMF 1st (ms): «queryStats.time_emf1st»''')
				println('''Syncer (mapped objects): «queryStats.size_syncer»''')
				println ('''Q2 EMF invariant result: «invResultEmf»''')
			}
			
			if (debug) println(syncer.stats)
			
			
			
			// objects have been full loaded, the DAO resolver is only needed for syncing
			emfQueries = new TCPDSQueries_emf()
	    	if (check_correctness) {
	    		invResultEmf = emfQueries.query2(srListEmf, sqlInvariantResult) // checks for correctness
	    		queryStats.correct_emf2nd = emfQueries.correct
	    	} else
	    		invResultEmf = emfQueries.query2(srListEmf)
	    	queryStats.time_emf2nd = emfQueries.computingTime.toMillis
	    	queryStats.memory_emf2nd = emfQueries.computingMemory.toMBs
	    	if (debug) { 
				println()	    		
				println('''Q2 EMF 2nd (ms): «queryStats.time_emf2nd»''')
				println ('''Q2 EMF invariant result: «invResultEmf»''')
			}
			
									
	
			queryStatsList.add(queryStats)
		}



    }
    
    
    
    
    
}