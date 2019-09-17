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

class Q1 {

    EntityManager em;
 
 	var String factor
 	var debug = false
 	var iterations = 1
 	var check_correctness = true 
 	var syncing_strategy = SyncingStrategy.LAZY 
// 	var tpcds.domain.lazy.Customer customer
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
//		this.customer = customer
	}
  
  
    def void runExperiments(List<QueryStats> queryStatsList) {
    	
    	var TCPDSQueries_emf emfQueries
    	var long time
    	var long memory 
    	
    	
    	
    	for (var i=0; i<iterations; i++) {
    		if (i % 10 == 0) println('''iteration «i»''')
    		
    		val queryStats = new QueryStats
    		queryStats.query = 'Q1'
    		queryStats.iteration = i
    		queryStats.factor = if ((factor===null) || (factor=='')) factor='01' 
    		queryStats.syncer_type = syncing_strategy.toString()
	    	
	    	
	    	var Collection<StoreReturns> storeReturnsJavaList
	    	var Collection<tpcds.gen.q1.StoreReturns> storeReturnsEmfList
			
			val queriesSQL = new TCPDSQueries_sql(em)
			val sqlStoreReturnsIdList = queriesSQL.query1()
			queryStats.time_sqlQuery = queriesSQL.computingTime.toMillis
			queryStats.memory_sqlQuery = queriesSQL.computingMemory.toMBs
			if (debug) {
				println()				
				println ('''Q1 SQL (ms): «queryStats.time_sqlQuery»''')
				println ('''Q1 SQL result set size: «sqlStoreReturnsIdList.toSet.size()»''')
			}
	        
	        
	        
			/*
			 * DO FETCHING ONCE as for big databases it can be very slow
			 */
	        time = System.nanoTime()
	        memory = peekMemoryUsage()
	    	val customer = em.createQuery(
					'''SELECT c FROM Customer c 
					LEFT JOIN FETCH c.storeReturns
					WHERE c.cCustomerSk = :id
					''', tpcds.domain.lazy.Customer)
				.setParameter("id", 2550L)
				.singleResult
			queryStats.time_fetching = since(time).toMillis
			queryStats.memory_fetching = memorySince(memory).toMBs
			if (debug) {
				println()			
				println('''Q1 ORM fetching time (ms): «queryStats.time_fetching»''')
			}
				
	        
	        
	        
	        
	        
	        
	        
			val daoResolver = new DAOResolver_JPA_TCPDS
	
	
	
			var javaQueries = new TCPDSQueries_java(daoResolver)    
			if (check_correctness) {	
		    	storeReturnsJavaList = javaQueries.query1(customer, sqlStoreReturnsIdList) // checks for correctness
		    	queryStats.correct_java1st = javaQueries.correct
		    } else
	    		storeReturnsJavaList = javaQueries.query1(customer) 
			
			queryStats.time_java1st = javaQueries.computingTime.toMillis
			queryStats.memory_java1st = javaQueries.computingMemory.toMBs
			if (debug) {
				println()				
				println('''Q1 Java (ms): «queryStats.time_java1st»''')
				println ('''Q1 Java result set size: «storeReturnsJavaList.toSet.size()»''')
			}
			
	
			javaQueries = new TCPDSQueries_java(daoResolver)    
			if (check_correctness) {
		    	storeReturnsJavaList = javaQueries.query1(customer, sqlStoreReturnsIdList) // checks for correctness
				queryStats.correct_java2nd = javaQueries.correct		    	
		    } else
	    		storeReturnsJavaList = javaQueries.query1(customer) 
			
			queryStats.time_java2nd = javaQueries.computingTime.toMillis
			queryStats.memory_java2nd = javaQueries.computingMemory.toMBs
			if (debug) {
				println()				
				println('''Q1 Java 2nd time (ms): «queryStats.time_java2nd»''')
				println ('''Q1 Java 2nd time result set size: «storeReturnsJavaList.toSet.size()»''')
			}
			
			
			
			
			// without DAO resolver we get duplicate objects
			val syncer = new Syncer(PACKAGE, size_model, daoResolver, #['tpcds.domain.lazy'])
			
	    	if (syncing_strategy == SyncingStrategy.EAGER) 
	    		syncer.syncingStrategy = SyncingStrategy.EAGER
			
			time = System.nanoTime()
			memory = peekMemoryUsage()
	    	val stListEmf = syncer.initialSync(newArrayList(customer)) 
	    	queryStats.time_syncer = since(time).toMillis
	    	queryStats.memory_syncer = memorySince(memory).toMBs
	    	if (debug) {
				println()	    		
				println('''Q1 Initial syncing time (ms): «queryStats.time_syncer»''')
			}
			
			
			
			/*
			 * EMF QUERY AFTER SYNCING
			 */
			
			// objects have been full loaded, the DAO resolver is only needed for syncing
			emfQueries = new TCPDSQueries_emf()
			if (check_correctness) {
	    		storeReturnsEmfList = emfQueries.query1(stListEmf.get(0) as Customer, sqlStoreReturnsIdList) as List<tpcds.gen.q1.StoreReturns> // checks for correctness
	    		queryStats.correct_emf1st = emfQueries.correct
	    	} else
	    		storeReturnsEmfList = emfQueries.query1(stListEmf.get(0) as Customer)
	    	queryStats.time_emf1st = emfQueries.computingTime.toMillis
	    	queryStats.memory_emf1st = emfQueries.computingMemory.toMBs
	    	// objects used in queries are now loaded in the map
	    	queryStats.size_syncer = syncer.javaToEmfMap.keySet.size 
	    	if (debug) {
				println()	    		
 				println('''Q1 EMF 1st (ms): «queryStats.time_emf1st»''')
				println('''Syncer (mapped objects): «queryStats.size_syncer»''')
				println ('''Q1 EMF result set size: «storeReturnsEmfList.toSet.size()»''')
			}
			
			if (debug) println(syncer.stats)
			
			
			
			// objects have been full loaded, the DAO resolver is only needed for syncing
			emfQueries = new TCPDSQueries_emf()
	    	if (check_correctness) {
	    		storeReturnsEmfList = emfQueries.query1(stListEmf.get(0) as Customer, sqlStoreReturnsIdList) // checks for correctness
	    		queryStats.correct_emf2nd = emfQueries.correct
	    	} else
	    		storeReturnsEmfList = emfQueries.query1(stListEmf.get(0) as Customer)
	    	queryStats.time_emf2nd = emfQueries.computingTime.toMillis
	    	queryStats.memory_emf2nd = emfQueries.computingMemory.toMBs
	    	if (debug) { 
				println()	    		
				println('''Q1 EMF 2nd (ms): «queryStats.time_emf2nd»''')
				println ('''Q1 EMF result set size: «storeReturnsEmfList.toSet.size()»''')
			}
			
									
			/*
			 * Updates
			 */
			time = System.nanoTime()
			memory = peekMemoryUsage
			
			syncer.track([			
				val emfCustomer = stListEmf.get(0) as Customer
				val sr = FACTORY.createStoreReturns
				sr.srReturnAmt = -1.0
				sr.srCustomerSk = emfCustomer
			])
			
			
			queryStats.time_update = since(time).toMillis
			queryStats.memory_update = memorySince(memory).toMillis
			

			if (this.debug) {
				println('''Update (ms): «queryStats.time_update»''')
				println('UPDATED: ' + syncer.emfToJavaSyncer.dirtyFeatures.values.map[size].reduce[a,b|a+b])
			}


			/*
			 * BACK PROPAGATION
			 */
			time = System.nanoTime()
			memory = peekMemoryUsage
			syncer.incrementalEmfToJavaSync()
			queryStats.time_backPropagation = since(time).toMillis
			queryStats.memory_backPropagation = memorySince(memory).toMillis
	    	queryStats.size_backPropagation = 
	    		(syncer.emfToJavaSyncer.dirtyFeatures.values.map[size].reduce[a,b|a+b] +
	    		syncer.emfToJavaSyncer.dirtyRootObjects.size) as long
			
			if (check_correctness) {
				queryStats.correct_backPropagation = syncer.javaToEmfMap.keySet
					.filter[StoreReturns.isInstance(it)]
					.map[it as StoreReturns]
					.exists[
						(it.srReturnAmt !== null && it.srReturnAmt==-1.0) 
						&& 
						(it.srCustomerSk!==null && it.srCustomerSk==customer)
					]
				
			}
			
	
	
			queryStatsList.add(queryStats)
		}



    }
    
    
    
    
    
}