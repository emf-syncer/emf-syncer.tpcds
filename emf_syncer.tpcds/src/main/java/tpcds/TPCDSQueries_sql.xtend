package tpcds

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import tpcds.domain.lazy.StoreReturns

import static util.Stats.*

@Component
class TPCDSQueries_sql {
 	@Autowired
	JdbcTemplate jdbcTemplate;
		
	@Accessors
	var long computingTime = 0
	@Accessors
	var long computingMemory = 0
	
	def List<String> query1() {
       	var long time
       	var long memory
       	
       	time = System.nanoTime()
       	memory = peekMemoryUsage()
    	val sqlStoreReturnsList = jdbcTemplate.queryForList(
    		'''select CONCAT(sr.sr_item_sk, '_', sr.sr_ticket_number) from customer c, store_returns sr
    		where sr_customer_sk=? and sr_customer_sk=c_customer_sk;''', String, 2550L) as List<String>
    	
    	
        computingTime = since(time)
        computingMemory = peekMemoryUsage() // we measure the memory used by the process // memorySince(memory)
        
        //println(sqlStoreReturnsList)
        
		//sqlStoreReturnsList.map[it.srId.srItemSk + "_" + it.srId.srTicketNumber].toList
		sqlStoreReturnsList
	}
	
	def Boolean query2() {
       	var long time
       	var long memory
       	
       	time = System.nanoTime()
       	memory = peekMemoryUsage()
    	//val sqlStoreReturnsList = srRepo.findStoreReturnsGrouped()
    	
    	val sqlStoreReturnsList = jdbcTemplate.query(
			'''SELECT
			    *
			FROM
			    store_returns
			GROUP BY
			    sr_item_sk, sr_ticket_number
			HAVING
			    COUNT(*) > 1;''', new BeanPropertyRowMapper(StoreReturns)) as List<StoreReturns>
    	
        computingTime = since(time)
        computingMemory = peekMemoryUsage() // we measure the memory used by the process // memorySince(memory)
        
        sqlStoreReturnsList.size > 0
	}
	
	def List<String> query3() {
       	var long time
       	var long memory
       	
       	time = System.nanoTime()
       	memory = peekMemoryUsage()
    	//val sqlCustomerIdList = customerRepo.findCustomersQuery().map[c|c.CCustomerId].toList
		val sqlCustomerIdList = jdbcTemplate.queryForList(
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
			order by c.c_customer_id;''', String) as List<String>
        computingTime = since(time)
        computingMemory = peekMemoryUsage() // we measure the memory used by the process // memorySince(memory)
        
        sqlCustomerIdList
	}
	
	

        
}