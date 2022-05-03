package tpcds;

import emf_syncer.EMFSyncer.SyncingStrategy
import java.util.List
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import tpcds.gen.q1.Customer
import tpcds.repository.StoreReturnsRepository
import util.QueryStats

import static extension util.Stats.*

@Component
class DriverReferenceMapper {
 	var DEBUG = false

 	@Autowired
 	TPCDSQueries_sql queriesSQL
 	@Autowired
 	TPCDSQueries_emf queriesEMF
	
	@Autowired
	StoreReturnsRepository srRepo
	
  
    def void runExperiments(String factor_, boolean debug, int iterations, boolean check_correctness, SyncingStrategy syncing_strategy, List<QueryStats> queryStatsList) {
    	var factor = factor_
    	var long time
    	var long memory 
    	
    	for (var i=0; i<iterations; i++) {
    		if (i % 10 == 0) println('''iteration «i»''')
    		
    		val queryStats = new QueryStats
    		queryStats.query = 'REFERENCE_MAPPER'
    		queryStats.iteration = i
    		queryStats.factor = if ((factor===null) || (factor=='')) factor='01' 
    		queryStats.syncer_type = syncing_strategy.toString()
	    	
	    	var List<Customer> customerEmfList
			
			//val queriesSQL = new TPCDSQueries_sql()
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
	        
	        
	        
	        
			/*
			 * REFERENCE MAPPING (PLAIN SYNCING without trace links)
			 */

			time = System.nanoTime()
			memory = peekMemoryUsage()
			var trafo = new ReferenceTrafo()
			var outputList = trafo.trafo(stList)
	    	queryStats.time_referenceMapper = since(time)
	    	queryStats.memory_referenceMapper = memorySince(memory)
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
	    	if (check_correctness) {
				queriesEMF.DEBUG = this.DEBUG
	    		customerEmfList = queriesEMF.query3(outputList, sqlCustomerIdList) // checks for correctness
		    	queryStats.correct_referenceMapper = queriesEMF.correct
	    	} else {
	    		customerEmfList = queriesEMF.query3(outputList)
	    	}
	    	if (debug) { 
				println()		    		
				println('''Q3 EMF for objects mapped with REFERENCE TRAFO (ms): «queriesEMF.computingTime»''')
				println ('''Q3 EMF for objects mapped with REFERENCE TRAFO result set size: «customerEmfList.toSet.size()»''')
				println ('''Q3 EMF for objects mapped with REFERENCE TRAFO result correcT?: «queriesEMF.correct»''')
			}
				
			queryStatsList.add(queryStats)
		}
    }
}