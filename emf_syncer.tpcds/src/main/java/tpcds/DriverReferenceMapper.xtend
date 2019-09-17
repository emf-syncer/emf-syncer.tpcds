package tpcds;

import java.util.List
import tpcds.ReferenceTrafo
import emf_syncer.Syncer.SyncingStrategy
import javax.persistence.EntityManager
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import tpcds.domain.lazy.StoreReturns
import tpcds.gen.q1.Customer
import tpcds.gen.q1.Q1Factory
import tpcds.gen.q1.Q1Package
import util.QueryStats

import static extension util.Stats.*

class DriverReferenceMapper {

    EntityManager em;
 
 	var String factor
 	var debug = false
 	var iterations = 1
 	var check_correctness = true 
 	var syncing_strategy = SyncingStrategy.LAZY 
// 	var csvFilePath = ''
// 	var List<StoreReturns> stList
 
	
	val PACKAGE = Q1Package.eINSTANCE
	val FACTORY = Q1Factory.eINSTANCE
	
    val Logger LOG = LoggerFactory.getLogger(Driver);
 	
	new(EntityManager em, String factor, boolean debug, int iterations, boolean check_correctness, SyncingStrategy syncing_strategy) {
		this.em = em
		this.factor = factor
		this.debug = debug
		this.iterations = iterations
		this.check_correctness = check_correctness
		this.syncing_strategy = syncing_strategy
//		this.csvFilePath = csvFilePath
//		this.stList = stList as List<StoreReturns>
	}
  
  
    def void runExperiments(List<QueryStats> queryStatsList) {
    	
    	var TCPDSQueries_emf emfQueries
    	var long time
    	var long memory 
    	


    	
    	for (var i=0; i<iterations; i++) {
    		if (i % 10 == 0) println('''iteration «i»''')
    		
    		
    		
    		
    		val queryStats = new QueryStats
    		queryStats.query = 'REFERENCE_MAPPER'
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
			
			// PAGINATION NOT WORKING: queries do not work properly, 
			// probably because we copy the list?
	//		val stList = em.runSqlQuery(StoreReturns, PAGE_SIZE, 
	//			'''SELECT sr FROM StoreReturns sr 
	//			LEFT JOIN FETCH sr.srReturnedDateSk
	//			LEFT JOIN FETCH sr.srCustomerSk
	//			LEFT JOIN FETCH sr.srStoreSk
	//			'''
	//		) as List<StoreReturns>
			queryStats.time_fetching = since(time).toMillis
			queryStats.memory_fetching = memorySince(memory).toMBs
			if (debug) {
				println()			
				println('''Q1 ORM fetching time (ms): «queryStats.time_fetching»''')
				println('''Q1 ORM fetching size: «stList.size»''')
			}
	        
	        
	        
	        
			/*
			 * REFERENCE MAPPING (PLAIN SYNCING without trace links)
			 */

			time = System.nanoTime()
			memory = peekMemoryUsage()
			var trafo = new ReferenceTrafo()
			var outputList = trafo.trafo(stList)
	    	queryStats.time_referenceMapper = since(time).toMillis
	    	queryStats.memory_referenceMapper = memorySince(memory).toMBs
	    	queryStats.size_mapper = trafo.objectCount
			if (debug) {
				println()					
				println('''Reference mapper time (ms): «queryStats.time_referenceMapper»''')
				println ('''Reference mapper result set size: «outputList.size()»''')
				println ('''Reference mapper feature count: «trafo.featureCount»''')
				println ('''Reference mapepr object count: «trafo.objectCount»''')
			}

			
							
			/*
			 * EMF QUERY
			 */
			 
			// objects have been full loaded, the DAO resolver is only needed for syncing
			emfQueries = new TCPDSQueries_emf()
	    	if (check_correctness) {
				emfQueries.DEBUG = this.debug
	    		customerEmfList = emfQueries.query3(outputList, sqlCustomerIdList) // checks for correctness
		    	queryStats.correct_referenceMapper = emfQueries.correct
	    	} else {
	    		customerEmfList = emfQueries.query3(outputList)
	    	}
	    	if (debug) { 
				println()		    		
				println('''Q3 EMF for objects mapped with REFERENCE TRAFO (ms): «emfQueries.computingTime.toMillis»''')
				println ('''Q3 EMF for objects mapped with REFERENCE TRAFO result set size: «customerEmfList.toSet.size()»''')
				println ('''Q3 EMF for objects mapped with REFERENCE TRAFO result correcT?: «emfQueries.correct»''')
			}
				
			
	
	
			queryStatsList.add(queryStats)
		}



    }
    
    
    
    
    
}