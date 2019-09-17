package tpcds

import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import emf_syncer.DAOResolver
import javax.persistence.EntityManager
import org.eclipse.xtend.lib.annotations.Accessors
import tpcds.domain.lazy.Customer
import tpcds.domain.lazy.Store
import tpcds.domain.lazy.StoreReturns

import static extension util.Stats.*

class TCPDSQueries_sql {
	var EntityManager em
   	var DEBUG = false
	
	@Accessors
	var long computingTime = 0
	@Accessors
	var long computingMemory = 0
	
	new(EntityManager em) {
		this.em=em
	}
	
	def List<String> query1() {
       	var long time
       	var long memory
       	
       	time = System.nanoTime()
       	memory = peekMemoryUsage()
    	val sqlStoreReturnsList = em.createNativeQuery(
			'''select sr.* from customer c, store_returns sr
			where
			      sr_customer_sk=2550 and
			      sr_customer_sk=c_customer_sk;''', StoreReturns).getResultList() as List<StoreReturns>
			
        computingTime = since(time)
        computingMemory = memorySince(memory)
        
		sqlStoreReturnsList.map[it.srId.srItemSk + "_" + it.srId.srTicketNumber].toList
	}
	
	def Boolean query2() {
       	var long time
       	var long memory
       	
       	time = System.nanoTime()
       	memory = peekMemoryUsage()
    	val sqlStoreReturnsList = em.createNativeQuery(
			'''SELECT
			    *
			FROM
			    store_returns
			GROUP BY
			    sr_item_sk, sr_ticket_number
			HAVING
			    COUNT(*) > 1;''', StoreReturns).getResultList() as List<StoreReturns>
			
        computingTime = since(time)
        computingMemory = memorySince(memory)
        
        sqlStoreReturnsList.size > 0
	}
	
	def List<String> query3() {
       	var long time
       	var long memory
       	
       	time = System.nanoTime()
       	memory = peekMemoryUsage()
    	val sqlCustomerIdList = em.createNativeQuery(
			'''with customer_total_return as
			  (select sr_customer_sk as ctr_customer_sk,sr_store_sk as ctr_store_sk, sum(sr_return_amt) as ctr_total_return
			  from store_returns, date_dim
			  where
			        sr_customer_sk is not null
			        and
			        sr_store_sk is not null
			        and
			        sr_returned_date_sk = d_date_sk
			        and d_year =2000
			  group by sr_customer_sk,sr_store_sk)
			
			select c.c_customer_id
			from customer_total_return ctr1,store s,customer c
			where
			  ctr1.ctr_total_return >
			
			    (select avg(ctr2.ctr_total_return)*1.2
			    from customer_total_return ctr2
			    where ctr1.ctr_store_sk = ctr2.ctr_store_sk)
			
			  and s.s_store_sk = ctr1.ctr_store_sk
			  and s.s_state = 'TN'
			  and ctr1.ctr_customer_sk = c.c_customer_sk
			order by c.c_customer_id;''').getResultList()
			
        computingTime = since(time)
        computingMemory = memorySince(memory)
        
        sqlCustomerIdList
	}
	
	

        
}