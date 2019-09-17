package tpcds

import java.util.Collection
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import java.util.stream.Collectors
import emf_syncer.DAOResolver
import org.eclipse.xtend.lib.annotations.Accessors
import tpcds.domain.lazy.Customer
import tpcds.domain.lazy.Store
import tpcds.domain.lazy.StoreReturns

import static util.Stats.*

class TCPDSQueries_java {
	var DAOResolver  daoResolver
	
	@Accessors
	var boolean DEBUG = false
	
	@Accessors
	var long computingTime_maps = 0
	var long computingTime_mean = 0
	var long computingTime_selection = 0
	@Accessors
	var long computingTime = 0
	@Accessors
	var long computingMemory = 0
	@Accessors
	var boolean correct = false
	
	new(DAOResolver daoResolver) {
		this.daoResolver=daoResolver	
	}
	
	def Collection<StoreReturns> query1(Customer customer) {
		query1(customer, #[])
	}
	def Collection<StoreReturns> query1(Customer customer, List<String> sqlStoreReturnsIdList) {
       	var long time 
       	var long memory 
    	
		time = System.nanoTime()
		memory = peekMemoryUsage()
		
		var storeReturns = customer.storeReturns

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
	    		(it.srId?.srItemSk ?: 0) + "_" + (it.srId?.srTicketNumber ?: 0)
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
	
	
	
	def List<Customer> query3(List<StoreReturns> stList) {
		query3(stList, #[])
	}
	def List<Customer> query3(List<StoreReturns> stList, List<String> sqlCustomerIdList) {
       	var long time 
       	var long memory 
    	var List<Customer> customerList = newArrayList
    	
		time = System.nanoTime()
		memory = peekMemoryUsage()
		var Map<Customer,Map<Store,Double>> ctrToStoreSumMap = newHashMap
        for (sr: stList) {
        	if (
        		sr.srCustomerSk !== null
        		&&
        		sr.srStoreSk !== null
        		&&
        		sr.srReturnAmt !== null 
        		&&
        		sr.srReturnedDateSk !== null
        		&&
        		sr.srReturnedDateSk.DYear==Long.valueOf(2000)
        	) {
        		var storeToAmtMap = ctrToStoreSumMap.putIfAbsent(daoResolver.getDbObject(sr.srCustomerSk) as Customer, newHashMap(sr.srStoreSk -> (sr.srReturnAmt?:0.0)))
        		if (storeToAmtMap !== null) {
        			val amt = storeToAmtMap.putIfAbsent(daoResolver.getDbObject(sr.srStoreSk) as Store, (sr.srReturnAmt?:0.0))
        			if (amt !== null) {
        				storeToAmtMap.put(daoResolver.getDbObject(sr.srStoreSk) as Store, amt + (sr.srReturnAmt?:0.0))
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
        			val pair = storeToMeanMap.get(daoResolver.getDbObject(storeToSum.key))
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
	
	

        
}