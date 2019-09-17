package tpcds

import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import java.util.stream.Collectors
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Accessors
import tpcds.gen.q1.Customer
import tpcds.gen.q1.Store
import tpcds.gen.q1.StoreReturns

import static util.Stats.*

class TCPDSQueries_emf {
	
	var long computingTime_maps = 0
	var long computingTime_mean = 0
	var long computingTime_selection = 0
	
	@Accessors
	var long computingTime = 0
	@Accessors
	var long computingMemory = 0

	@Accessors
   	var boolean DEBUG = false
	@Accessors
   	var boolean correct = false



	def EList<StoreReturns> query1(Customer customer) {
		val s = EcoreUtil.equals(customer, customer)
		
		query1(customer, #[])
		
		
	}
	def EList<StoreReturns> query1(Customer customer, List<String> sqlStoreReturnsIdList) {
       	var long time 
       	var long memory 
    	
		time = System.nanoTime()
		memory = peekMemoryUsage()
		
		val storeReturns = customer.storeReturns

        computingTime = since(time)
		computingMemory = memorySince(memory)


		// CORRECTNESS AGAINST RESULT IN SQL
		var Set<String> sqlIdSet
		var Set<String> idSet 
		var Set<String> onlyInSql
		var Set<String> onlyInJava 

		if (!sqlStoreReturnsIdList.empty) {
		
	    	sqlIdSet = sqlStoreReturnsIdList.toSet
	    	idSet = storeReturns.map[
	    		(it.srId?.srItemSk ?:0) + 
	    		"_" + 
	    		(it.srId?.srTicketNumber ?: 0)
	    	].toSet
	    	
	    	onlyInSql = new HashSet<String>(sqlIdSet);
	    	onlyInSql.removeAll(idSet)
	    	if (DEBUG) {
	    		println('customers in SQL query but not in EMF query:')
	    		onlyInSql.forEach[println(it)]
    		}
	
			onlyInJava = new HashSet<String>(idSet);
	    	onlyInJava.removeAll(sqlIdSet)
	    	if (DEBUG) {
	    		println('customers in EMF query but not in SQL query:')
	    		onlyInJava.forEach[println(it)]
	    	}
		
			correct = onlyInSql.empty && onlyInJava.empty
		}

		return	storeReturns	
	}
	

	def Boolean query2(List<StoreReturns> storeReturnsList) {
		query2(storeReturnsList, null)
	}
	def Boolean query2(List<StoreReturns> storeReturnsList, Boolean sqlResult) {
       	var long time 
       	var long memory 
    	
		time = System.nanoTime()
		memory = peekMemoryUsage()
		
		val set = storeReturnsList.stream.map([sr | '''«sr.srId?.srItemSk»-«sr.srId?.srTicketNumber»''']).collect(Collectors.toSet)
		val resultInvariant = (set.size != storeReturnsList.size)	
		
        computingTime = since(time)
		computingMemory = memorySince(memory)

		// CORRECTNESS AGAINST RESULT IN SQL
		if (sqlResult !== null) {
			correct = (sqlResult == resultInvariant)
		}

		return	resultInvariant	
	}

	def List<Customer> query3(List<? extends EObject> stList) {
		query3(stList, #[])
	}
	
	
	
	
	def List<Customer> query3(List<? extends EObject> stList, List<String> sqlCustomerIdList) {

       	var long time 
       	var long memory
		time = System.nanoTime()
		memory = peekMemoryUsage()   	
		var List<Customer> customerList = newArrayList
		var Map<Customer,Map<Store,Double>> ctrToStoreSumMap = newHashMap
		
		
		
        for (sr_var: stList) {
        	val sr = sr_var as StoreReturns
        	if (
        		sr.srCustomerSk !== null
        		&&
        		sr.srStoreSk !== null
        		&&
				// first force initialization of field and then check if it has been initialized 
        		((sr.srReturnAmt>=0.0) && sr.isSetSrReturnAmt)
        		&&
        		sr.srReturnedDateSk !== null
        		&&
        		sr.srReturnedDateSk?.DYear==Long.valueOf(2000)
        	) {
        		var storeToAmtMap = ctrToStoreSumMap.putIfAbsent(sr.srCustomerSk, newHashMap(sr.srStoreSk -> sr.srReturnAmt))
        		if (storeToAmtMap !== null) {
        			val amt = storeToAmtMap.putIfAbsent(sr.srStoreSk, sr.srReturnAmt)
        			if (amt !== null) {
        				storeToAmtMap.put(sr.srStoreSk, amt + sr.srReturnAmt)
        			}
        		}
	        }
        }
        
        computingTime_maps = since(time)
        if (DEBUG) println('''computing maps took: «computingTime_maps»''')
        
        //compute avg
        time = System.nanoTime()
        val Map<Store,Pair<Integer,Double>> storeToMeanMap = newHashMap()
        for (ctrToStoreSum: ctrToStoreSumMap.entrySet) {
        	for (storeToSum: ctrToStoreSum.value.entrySet) {
        		val pairCountMean = storeToMeanMap.putIfAbsent(storeToSum.key, 1 -> storeToSum.value)
        		if (pairCountMean !== null) 
        			storeToMeanMap.put(storeToSum.key, pairCountMean.key + 1 -> pairCountMean.value + storeToSum.value)
        	}
        }
        computingTime_mean = since(time)
        if (DEBUG) println('''computing mean took: «computingTime_mean»''')
        
        
        // selecting customers
        time = System.nanoTime() 
        for (ctrToStoreSum: ctrToStoreSumMap.entrySet) {
        	for (storeToSum: ctrToStoreSum.value.entrySet) {
        		if (storeToSum.key.SState=='TN') {
        			val pair = storeToMeanMap.get(storeToSum.key)
        			if (storeToSum.value > (1.2 * (pair.value/pair.key))) {
        				customerList.add(ctrToStoreSum.key)
        			}
        		}
        	}
        }
        computingTime_selection = since(time)
        if (DEBUG) println('''selecting customers took: «computingTime_selection»''')
        
        computingTime = computingTime_maps + computingTime_mean + computingTime_selection
		computingMemory = memorySince(memory)		





		// CORRECTNESS AGAINST RESULT IN SQL
		var Set<String> sqlCustomerIdSet
		var Set<String> customerIdSet 
		var Set<String> onlyInSql
		var Set<String> onlyInJava 

		if (!sqlCustomerIdList.empty) {
		
	    	sqlCustomerIdSet = sqlCustomerIdList.toSet
	    	customerIdSet = customerList.map[it.CCustomerId].toSet
	    	
	    	onlyInSql = new HashSet<String>(sqlCustomerIdSet);
	    	onlyInSql.removeAll(customerIdSet)
	    	if (DEBUG) {
	    		println('customers in SQL query but not in EMF query:')
	    		onlyInSql.forEach[println(it)]
			}
			
			onlyInJava = new HashSet<String>(customerIdSet);
	    	onlyInJava.removeAll(sqlCustomerIdSet)
	    	if (DEBUG) {
	    		println('customers in EMF query but not in SQL query:')
	    		onlyInJava.forEach[println(it)]
    		}
    		
    		correct = onlyInSql.empty && onlyInJava.empty
		}
		return	customerList	
        
	}
	
	
	def returnsIn2000(List<? extends EObject> returnList) {
		returnList.filter[ sr_var |
			val sr = sr_var as StoreReturns
			sr.srCustomerSk !== null
    		&&
    		sr.srStoreSk !== null
    		&&
			// first force initialization of field and then check if it has been initialized 
    		((sr.srReturnAmt>=0.0) && sr.isSetSrReturnAmt)
    		&&
    		sr.srReturnedDateSk !== null
    		&&
    		sr.srReturnedDateSk.DYear==Long.valueOf(2000)
		]
	}
	
	
	
		

        
}