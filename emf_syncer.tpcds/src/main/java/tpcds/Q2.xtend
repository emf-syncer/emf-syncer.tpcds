package tpcds;

import emf_syncer.DAOResolver_JPA_TCPDS
import emf_syncer.EMFSyncer
import emf_syncer.EMFSyncer.SyncingStrategy
import java.util.List
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import tpcds.gen.q1.Q1Package
import tpcds.gen.q1.StoreReturns
import tpcds.repository.StoreReturnsRepository
import util.QueryStats

import static extension util.Stats.*

@Component
class Q2 {

	@Autowired
 	TPCDSQueries_sql queriesSQL
 	@Autowired
 	TPCDSQueries_java queriesJava
 	@Autowired
 	TPCDSQueries_emf queriesEMF
 	
	@Autowired
	StoreReturnsRepository srRepo
	
	val PACKAGE = Q1Package.eINSTANCE
	
  
    def void runExperiments(String factor_, int size_model, boolean debug, int iterations, boolean check_correctness, SyncingStrategy syncing_strategy, List<QueryStats> queryStatsList) {
    	var factor = factor_
    	var long time
    	var long memory 
    	
    	
    	for (var i=0; i<iterations; i++) {
    		if (i<10) println('''Q2 iteration «i»''')
    		else if (i % 10 == 0) println('''Q2 iteration «i»''')
    		
    		val queryStats = new QueryStats
    		queryStats.query = 'Q2'
    		queryStats.iteration = i
    		queryStats.factor = if ((factor===null) || (factor=='')) factor='01' 
    		queryStats.syncer_type = syncing_strategy.toString()
	    	
	    	
	    	var Boolean invResultJava
	    	var Boolean invResultEmf
			
			val sqlInvariantResult = queriesSQL.query2()
			queryStats.time_sqlQuery = queriesSQL.computingTime
			queryStats.memory_sqlQuery = queriesSQL.computingMemory
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
	    	val srList = srRepo.findAll()
			queryStats.time_fetching = since(time)
			queryStats.memory_fetching = memorySince(memory)
			if (debug) {
				println()			
				println('''Q2 ORM fetching time (ms): «queryStats.time_fetching»''')
			}
				
	        
	        
			val daoResolver = new DAOResolver_JPA_TCPDS
	
	
	
			queriesJava.setDaoResolver(daoResolver)
			if (check_correctness) {	
		    	invResultJava = queriesJava.query2(srList, sqlInvariantResult) // checks for correctness
		    	queryStats.correct_java1st = queriesJava.correct
		    } else
	    		invResultJava = queriesJava.query2(srList) 
			
			queryStats.time_java1st = queriesJava.computingTime
			queryStats.memory_java1st = queriesJava.computingMemory
			if (debug) {
				println()				
				println('''Q2 Java (ms): «queryStats.time_java1st»''')
				println ('''Q2 Java invariant result: «invResultJava»''')
			}
			
	
			//queriesJava2.setDaoResolver(daoResolver)
			if (check_correctness) {
		    	invResultJava = queriesJava.query2(srList, sqlInvariantResult) // checks for correctness
				queryStats.correct_java2nd = queriesJava.correct		    	
		    } else
	    		invResultJava = queriesJava.query2(srList) 
			
			queryStats.time_java2nd = queriesJava.computingTime
			queryStats.memory_java2nd = queriesJava.computingMemory
			if (debug) {
				println()				
				println('''Q2 Java 2nd time (ms): «queryStats.time_java2nd»''')
				println ('''Q2 Java 2nd time invariant result: «invResultJava»''')
			}
			
			
			// without DAO resolver we get duplicate objects
			val syncer = new EMFSyncer(#['tpcds.domain.lazy'], PACKAGE, size_model, daoResolver)
			
	    	if (syncing_strategy == SyncingStrategy.EAGER) 
	    		syncer.syncingStrategy = SyncingStrategy.EAGER
			
			time = System.nanoTime()
			memory = peekMemoryUsage()
	    	val srListEmf = syncer.forwardSync(srList).map[it as StoreReturns]
	    	queryStats.time_syncer = since(time)
	    	queryStats.memory_syncer = memorySince(memory)
	    	if (debug) {
				println()	    		
				println('''Q2 Initial syncing time (ms): «queryStats.time_syncer»''')
			}
			
			
			/*
			 * EMF QUERY AFTER SYNCING
			 */
			
			// objects have been full loaded, the DAO resolver is only needed for syncing
			if (check_correctness) {
	    		invResultEmf = queriesEMF.query2(srListEmf, sqlInvariantResult)  // checks for correctness
	    		queryStats.correct_emf1st = queriesEMF.correct
	    	} else
	    		invResultEmf = queriesEMF.query2(srListEmf)
	    	queryStats.time_emf1st = queriesEMF.computingTime
	    	queryStats.memory_emf1st = queriesEMF.computingMemory
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
	    	if (check_correctness) {
	    		invResultEmf = queriesEMF.query2(srListEmf, sqlInvariantResult) // checks for correctness
	    		queryStats.correct_emf2nd = queriesEMF.correct
	    	} else
	    		invResultEmf = queriesEMF.query2(srListEmf)
	    	queryStats.time_emf2nd = queriesEMF.computingTime
	    	queryStats.memory_emf2nd = queriesEMF.computingMemory
	    	if (debug) { 
				println()	    		
				println('''Q2 EMF 2nd (ms): «queryStats.time_emf2nd»''')
				println ('''Q2 EMF invariant result: «invResultEmf»''')
			}
			queryStatsList.add(queryStats)
		}
    }
    
}