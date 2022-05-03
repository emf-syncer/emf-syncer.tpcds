package tpcds;

import emf_syncer.DAOResolver_JPA_TCPDS
import emf_syncer.EMFSyncer
import emf_syncer.EMFSyncer.SyncingStrategy
import java.util.Collection
import java.util.List
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import tpcds.domain.lazy.StoreReturns
import tpcds.gen.q1.Customer
import tpcds.gen.q1.Q1Factory
import tpcds.gen.q1.Q1Package
import util.QueryStats

import static extension util.Stats.*
import tpcds.repository.CustomerRepository

@Component
class Q1 {

 	var debug = false
 
 	@Autowired
 	TPCDSQueries_sql queriesSQL
 	@Autowired
 	TPCDSQueries_java queriesJava
 	@Autowired
 	TPCDSQueries_emf queriesEMF
	
	@Autowired
	CustomerRepository customerRepo
	
	val PACKAGE = Q1Package.eINSTANCE
	val FACTORY = Q1Factory.eINSTANCE
	
    def void runExperiments(String factor_, int size_model, boolean debug, int iterations, boolean check_correctness, SyncingStrategy syncing_strategy, List<QueryStats> queryStatsList) {
    	var factor = factor_
    	var long time
    	var long memory 
    	
    	for (var i=0; i<iterations; i++) {
    		if (i<10) println('''Q1 iteration «i»''')
    		else if (i % 10 == 0) println('''Q1 iteration «i»''')
    		
    		val queryStats = new QueryStats
    		queryStats.query = 'Q1'
    		queryStats.iteration = i
    		queryStats.factor = if ((factor===null) || (factor=='')) factor='01' 
    		queryStats.syncer_type = syncing_strategy.toString()
	    	
	    	
	    	var Collection<StoreReturns> storeReturnsJavaList
	    	var Collection<tpcds.gen.q1.StoreReturns> storeReturnsEmfList
			
			val sqlStoreReturnsIdList = queriesSQL.query1()
			queryStats.time_sqlQuery = queriesSQL.computingTime
			queryStats.memory_sqlQuery = queriesSQL.computingMemory
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
	    	val customer = customerRepo.findByCCustomerSk(2550L)
			queryStats.time_fetching = since(time)
			queryStats.memory_fetching = memorySince(memory)
			if (debug) {
				println()			
				println('''Q1 ORM fetching time (ms): «queryStats.time_fetching»''')
			}
			
			val daoResolver = new DAOResolver_JPA_TCPDS
			queriesJava.setDaoResolver(daoResolver)
			if (check_correctness) {	
		    	storeReturnsJavaList = queriesJava.query1(customer, sqlStoreReturnsIdList) // checks for correctness
		    	queryStats.correct_java1st = queriesJava.correct
		    } else
	    		storeReturnsJavaList = queriesJava.query1(customer) 
			
			queryStats.time_java1st = queriesJava.computingTime
			queryStats.memory_java1st = queriesJava.computingMemory
			if (debug) {
				println()				
				println('''Q1 Java (ms): «queryStats.time_java1st»''')
				println ('''Q1 Java result set size: «storeReturnsJavaList.toSet.size()»''')
			}
			
	
			if (check_correctness) {
		    	storeReturnsJavaList = queriesJava.query1(customer, sqlStoreReturnsIdList) // checks for correctness
				queryStats.correct_java2nd = queriesJava.correct		    	
		    } else
	    		storeReturnsJavaList = queriesJava.query1(customer) 
			
			queryStats.time_java2nd = queriesJava.computingTime
			queryStats.memory_java2nd = queriesJava.computingMemory
			if (debug) {
				println()				
				println('''Q1 Java 2nd time (ms): «queryStats.time_java2nd»''')
				println ('''Q1 Java 2nd time result set size: «storeReturnsJavaList.toSet.size()»''')
			}
			
			
			
			
			// without DAO resolver we get duplicate objects
			val syncer = new EMFSyncer(#['tpcds.domain.lazy'], PACKAGE, size_model, daoResolver)
			
	    	if (syncing_strategy == SyncingStrategy.EAGER) 
	    		syncer.syncingStrategy = SyncingStrategy.EAGER
			
			time = System.nanoTime()
			memory = peekMemoryUsage()
	    	val stListEmf = syncer.forwardSync(newArrayList(customer)) 
	    	queryStats.time_syncer = since(time)
	    	queryStats.memory_syncer = memorySince(memory)
	    	if (debug) {
				println()	    		
				println('''Q1 Initial syncing time (ms): «queryStats.time_syncer»''')
			}
			
			
			
			/*
			 * EMF QUERY AFTER SYNCING
			 */
			
			// objects have been fully loaded, the DAO resolver is only needed for syncing
			if (check_correctness) {
	    		storeReturnsEmfList = queriesEMF.query1(stListEmf.get(0) as Customer, sqlStoreReturnsIdList) as List<tpcds.gen.q1.StoreReturns> // checks for correctness
	    		queryStats.correct_emf1st = queriesEMF.correct
	    	} else
	    		storeReturnsEmfList = queriesEMF.query1(stListEmf.get(0) as Customer)
	    	queryStats.time_emf1st = queriesEMF.computingTime
	    	queryStats.memory_emf1st = queriesEMF.computingMemory
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
	    	if (check_correctness) {
	    		storeReturnsEmfList = queriesEMF.query1(stListEmf.get(0) as Customer, sqlStoreReturnsIdList) // checks for correctness
	    		queryStats.correct_emf2nd = queriesEMF.correct
	    	} else
	    		storeReturnsEmfList = queriesEMF.query1(stListEmf.get(0) as Customer)
	    	queryStats.time_emf2nd = queriesEMF.computingTime
	    	queryStats.memory_emf2nd = queriesEMF.computingMemory
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
			
			
			queryStats.time_update = since(time)
			queryStats.memory_update = memorySince(memory)
			

			if (this.debug) {
				println('''Update (ms): «queryStats.time_update»''')
				println('UPDATED: ' + syncer.dirtyFeatureCardinality)
			}


			/*
			 * BACK PROPAGATION
			 */
			time = System.nanoTime()
			memory = peekMemoryUsage
			syncer.backSync()
			queryStats.time_backPropagation = since(time)
			queryStats.memory_backPropagation = memorySince(memory)
	    	if (!syncer.noDirtyFeatures) {
	    		queryStats.size_backPropagation = 
		    		(syncer.dirtyFeatureCardinality +
		    		syncer.dirtyRootObjectCardinality) as long
				
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
			}
	
			queryStatsList.add(queryStats)
		}
    }
    
}