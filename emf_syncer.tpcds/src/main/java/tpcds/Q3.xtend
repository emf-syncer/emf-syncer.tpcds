package tpcds;

import com.opencsv.bean.StatefulBeanToCsvBuilder
import java.io.FileWriter
import java.io.Writer
import java.text.DecimalFormat
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.List
import java.util.Locale
import emf_syncer.DAOResolver_JPA_TCPDS
import emf_syncer.Syncer
import emf_syncer.Syncer.SyncingStrategy
import javax.persistence.EntityManager
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import tpcds.domain.lazy.DateDim
import tpcds.domain.lazy.Store
import tpcds.domain.lazy.StoreReturns
import tpcds.gen.q1.Customer
import tpcds.gen.q1.Q1Factory
import tpcds.gen.q1.Q1Package
import util.QueryStats

import static extension util.Stats.*

class Q3 {

    EntityManager em;
 
 	var String factor
 	var debug = false
 	var iterations = 1
 	var check_correctness = true 
 	var syncing_strategy = SyncingStrategy.LAZY 
 	var int size_model
	
	val PACKAGE = Q1Package.eINSTANCE
	val FACTORY = Q1Factory.eINSTANCE
	
    val Logger LOG = LoggerFactory.getLogger(Driver);
 	
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
    		queryStats.query = 'Q3'
    		queryStats.iteration = i
    		queryStats.factor = if ((factor===null) || (factor=='')) factor='01'
    		queryStats.syncer_type = syncing_strategy.toString()
	    	
	    	var List<tpcds.domain.lazy.Customer> customerJavaList
	    	var List<Customer> customerEmfList
			
			val queriesSQL = new TCPDSQueries_sql(em)
			val sqlCustomerIdList = queriesSQL.query3()
			queryStats.time_sqlQuery = queriesSQL.computingTime.toMillis
			queryStats.memory_sqlQuery = queriesSQL.computingMemory.toMBs
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
	    	val stList = em.createQuery(
				'''SELECT sr FROM StoreReturns sr 
				LEFT JOIN FETCH sr.srReturnedDateSk
				LEFT JOIN FETCH sr.srCustomerSk
				LEFT JOIN FETCH sr.srStoreSk
				''', StoreReturns).getResultList()
			
			queryStats.time_fetching = since(time).toMillis
			queryStats.memory_fetching = memorySince(memory).toMBs
			if (debug) {
				println()			
				println('''Q1 ORM fetching time (ms): «queryStats.time_fetching»''')
				println('''Q1 ORM fetching size: «stList.size»''')
			}
	        
	        
	        
	        
	        
	        
	        
	        
			val daoResolver = new DAOResolver_JPA_TCPDS
	
	
	
			var javaQueries = new TCPDSQueries_java(daoResolver)    
			if (check_correctness) {	
		    	customerJavaList = javaQueries.query3(stList, sqlCustomerIdList) // checks for correctness
		    	queryStats.correct_java1st = javaQueries.correct
		    } else
	    		customerJavaList = javaQueries.query3(stList) 
			
			queryStats.time_java1st = javaQueries.computingTime.toMillis
			queryStats.memory_java1st = javaQueries.computingMemory.toMBs
			if (debug) {
				println()				
				println('''Q3 Java (ms): «queryStats.time_java1st»''')
				println ('''Q3 Java result set size: «customerJavaList.toSet.size()»''')
			}
			
	
			javaQueries = new TCPDSQueries_java(daoResolver)    
			if (check_correctness) {
		    	customerJavaList = javaQueries.query3(stList, sqlCustomerIdList) // checks for correctness
				queryStats.correct_java2nd = javaQueries.correct		    	
		    } else
	    		customerJavaList = javaQueries.query3(stList) 
			
			queryStats.time_java2nd = javaQueries.computingTime.toMillis
			queryStats.memory_java2nd = javaQueries.computingMemory.toMBs
			if (debug) {
				println()				
				println('''Q3 Java 2nd time (ms): «queryStats.time_java2nd»''')
				println ('''Q3 Java 2nd time result set size: «customerJavaList.toSet.size()»''')
			}
			
			
			
			
			// without DAO resolver we get duplicate objects
			val syncer = new Syncer(PACKAGE, size_model, daoResolver, #['tpcds.domain.lazy'])
			
			
	    	if (syncing_strategy == SyncingStrategy.EAGER) 
	    		syncer.syncingStrategy = SyncingStrategy.EAGER
			
			time = System.nanoTime()
			memory = peekMemoryUsage()
	    	val stListEmf = syncer.initialSync(stList) 
	    	queryStats.time_syncer = since(time).toMillis
	    	queryStats.memory_syncer = memorySince(memory).toMBs
	    	if (debug) {
				println()	    		
				println('''Q3 Initial syncing time (ms): «queryStats.time_syncer»''')
			}
			
			
			
			
			/*
			 * EMF QUERY AFTER SYNCING
			 */
			
			// objects have been full loaded, the DAO resolver is only needed for syncing
			emfQueries = new TCPDSQueries_emf()
			if (check_correctness) {
	    		customerEmfList = emfQueries.query3(stListEmf, sqlCustomerIdList) // checks for correctness
	    		queryStats.correct_emf1st = emfQueries.correct
	    	} else
	    		customerEmfList = emfQueries.query3(stListEmf)
	    	queryStats.time_emf1st = emfQueries.computingTime.toMillis
	    	queryStats.memory_emf1st = emfQueries.computingMemory.toMBs
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
			emfQueries = new TCPDSQueries_emf()
	    	if (check_correctness) {
	    		customerEmfList = emfQueries.query3(stListEmf, sqlCustomerIdList) // checks for correctness
	    		queryStats.correct_emf2nd = emfQueries.correct
	    	} else
	    		customerEmfList = emfQueries.query3(stListEmf)
	    	queryStats.time_emf2nd = emfQueries.computingTime.toMillis
	    	queryStats.memory_emf2nd = emfQueries.computingMemory.toMBs
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
			
			
			
			queryStats.time_update = since(time).toMillis
			queryStats.memory_update = memorySince(memory).toMillis
			
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
			queryStats.time_update2 = since(time).toMillis
			queryStats.memory_update2 = memorySince(memory).toMillis
			

			if (this.debug) {
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
			val val1 = syncer
	    			.emfToJavaSyncer
	    			.dirtyFeatures
	    			.values
	    			.map[size]
	    			.reduce[a,b|a+b]
	    	val val2 = syncer
	    			.emfToJavaSyncer
	    			.dirtyRootObjects
	    			.size
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