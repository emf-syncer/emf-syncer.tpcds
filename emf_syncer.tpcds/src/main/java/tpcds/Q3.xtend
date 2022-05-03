package tpcds;

import emf_syncer.DAOResolver_JPA_TCPDS
import emf_syncer.EMFSyncer
import emf_syncer.EMFSyncer.SyncingStrategy
import java.util.List
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import tpcds.gen.q1.Customer
import tpcds.gen.q1.Q1Package
import tpcds.repository.StoreReturnsRepository
import util.QueryStats

import static extension util.Stats.*

@Component
class Q3 {

 	var debug = false
	
	val PACKAGE = Q1Package.eINSTANCE
	
	@Autowired
 	TPCDSQueries_sql queriesSQL
 	@Autowired
 	TPCDSQueries_java queriesJava
 	@Autowired
 	TPCDSQueries_emf queriesEMF
 	
	@Autowired
	StoreReturnsRepository srRepo
	
    def void runExperiments(String factor_, int size_model, boolean debug, int iterations, boolean check_correctness, SyncingStrategy syncing_strategy, List<QueryStats> queryStatsList) {
    	var factor = factor_
    	
    	var long time
    	var long memory 
    	
    	for (var i=0; i<iterations; i++) {
    		if (i<10) println('''Q3 iteration «i»''')
    		else if (i % 10 == 0) println('''Q3 iteration «i»''')
    		
    		val queryStats = new QueryStats
    		queryStats.query = 'Q3'
    		queryStats.iteration = i
    		queryStats.factor = if ((factor===null) || (factor=='')) factor='01'
    		queryStats.syncer_type = syncing_strategy.toString()
	    	
	    	var List<tpcds.domain.lazy.Customer> customerJavaList
	    	var List<Customer> customerEmfList
			
			val sqlCustomerIdList = queriesSQL.query3()
			queryStats.time_sqlQuery = queriesSQL.computingTime
			queryStats.memory_sqlQuery = queriesSQL.computingMemory
			if (debug) {
				println()				
				println ('''Q3 SQL (ms): «queryStats.time_sqlQuery»''')
				println ('''Q3 SQL result set size: «sqlCustomerIdList.toSet.size()»''')
			}
	        
	        
	        /*
			 * DO FETCHING ONCE as for big databases it can be very slow
			 */
	        time = System.nanoTime()
	        memory = peekMemoryUsage()
	    	val stList = srRepo.findStoreReturnsWithFetch()
			
			queryStats.time_fetching = since(time)
			queryStats.memory_fetching = memorySince(memory)
			if (debug) {
				println()			
				println('''Q1 ORM fetching time (ms): «queryStats.time_fetching»''')
				println('''Q1 ORM fetching size: «stList.size»''')
			}
	        
			val daoResolver = new DAOResolver_JPA_TCPDS
			queriesJava.setDaoResolver(daoResolver)
			if (check_correctness) {	
		    	customerJavaList = queriesJava.query3(stList, sqlCustomerIdList) // checks for correctness
		    	queryStats.correct_java1st = queriesJava.correct
		    } else
	    		customerJavaList = queriesJava.query3(stList) 
			
			queryStats.time_java1st = queriesJava.computingTime
			queryStats.memory_java1st = queriesJava.computingMemory
			if (debug) {
				println()				
				println('''Q3 Java (ms): «queryStats.time_java1st»''')
				println ('''Q3 Java result set size: «customerJavaList.toSet.size()»''')
			}
			
	
			if (check_correctness) {
		    	customerJavaList = queriesJava.query3(stList, sqlCustomerIdList) // checks for correctness
				queryStats.correct_java2nd = queriesJava.correct		    	
		    } else
	    		customerJavaList = queriesJava.query3(stList) 
			
			queryStats.time_java2nd = queriesJava.computingTime
			queryStats.memory_java2nd = queriesJava.computingMemory
			if (debug) {
				println()				
				println('''Q3 Java 2nd time (ms): «queryStats.time_java2nd»''')
				println ('''Q3 Java 2nd time result set size: «customerJavaList.toSet.size()»''')
			}
			
			
			// without DAO resolver we get duplicate objects
			val syncer = new EMFSyncer(#['tpcds.domain.lazy'], PACKAGE, size_model, daoResolver)
			
			
	    	if (syncing_strategy == SyncingStrategy.EAGER) 
	    		syncer.syncingStrategy = SyncingStrategy.EAGER
			
			time = System.nanoTime()
			memory = peekMemoryUsage()
	    	val stListEmf = syncer.forwardSync(stList) 
	    	queryStats.time_syncer = since(time)
	    	queryStats.memory_syncer = memorySince(memory)
	    	if (debug) {
				println()	    		
				println('''Q3 Initial syncing time (ms): «queryStats.time_syncer»''')
			}
			
			
			/*
			 * EMF QUERY AFTER SYNCING
			 */
			
			// objects have been full loaded, the DAO resolver is only needed for syncing
			queriesEMF = new TPCDSQueries_emf()
			if (check_correctness) {
	    		customerEmfList = queriesEMF.query3(stListEmf, sqlCustomerIdList) // checks for correctness
	    		queryStats.correct_emf1st = queriesEMF.correct
	    	} else
	    		customerEmfList = queriesEMF.query3(stListEmf)
	    	queryStats.time_emf1st = queriesEMF.computingTime
	    	queryStats.memory_emf1st = queriesEMF.computingMemory
	    	// objects used in queries are now loaded in the map
	    	queryStats.size_syncer = syncer.javaToEmfMap.keySet.size 
	    	if (debug) {
				println()	    		
 				println('''Q3 EMF 1st (ms): «queryStats.time_emf1st»''')
				println('''Syncer (mapped objects): «queryStats.size_syncer»''')
				println ('''Q3 EMF result set size: «customerEmfList.toSet.size()»''')
			}
			
			if (debug) println(syncer.stats)
			
			// objects have been full loaded, the DAO resolver is only needed for syncing
	    	if (check_correctness) {
	    		customerEmfList = queriesEMF.query3(stListEmf, sqlCustomerIdList) // checks for correctness
	    		queryStats.correct_emf2nd = queriesEMF.correct
	    	} else
	    		customerEmfList = queriesEMF.query3(stListEmf)
	    	queryStats.time_emf2nd = queriesEMF.computingTime
	    	queryStats.memory_emf2nd = queriesEMF.computingMemory
	    	if (debug) { 
				println()	    		
				println('''Q3 EMF 2nd (ms): «queryStats.time_emf2nd»''')
				println ('''Q3 EMF result set size: «customerEmfList.toSet.size()»''')
			}
			
									
			/*
			 * Updates
			 */
			time = System.nanoTime()
			memory = peekMemoryUsage
			
			
			val customerEmfListImmutable = customerEmfList
			syncer.track(
				[	
					customerEmfListImmutable.forEach[ c |
						c.CPreferredCustFlag = 'N'
					]
				]
			)
			
			
			
			queryStats.time_update = since(time)
			queryStats.memory_update = memorySince(memory)
			
			/* 
			 * UPDATE 2 with lazy synced feature values resolved already
			 */
			time = System.nanoTime()
			memory = peekMemoryUsage
			val customerEmfListImmutable2 = customerEmfList
			syncer.track(
				[	
					customerEmfListImmutable2.forEach[ c |
						c.CPreferredCustFlag = 'N'
					]
				]
			)
			queryStats.time_update2 = since(time)
			queryStats.memory_update2 = memorySince(memory)
			

			if (this.debug) {
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
			var val1 = 0
			if (!syncer.noDirtyFeatures) 
			{
				val1 = syncer.dirtyFeatureCardinality
	    	}
	    	var val2 = syncer.dirtyRootObjectCardinality
	    	queryStats.size_backPropagation = 
	    		(val1 + val2) as long
			
			if (check_correctness) {
				for (eCustomer : customerEmfList) {
					val jCustomer = syncer.emfToJavaMap.get(eCustomer) as tpcds.domain.lazy.Customer
					queryStats.correct_backPropagation = true
					if ((jCustomer.CPreferredCustFlag===null) || (jCustomer.CPreferredCustFlag != 'N')) 
						queryStats.correct_backPropagation = false
				}
			}
			queryStatsList.add(queryStats)
		}
    }
}