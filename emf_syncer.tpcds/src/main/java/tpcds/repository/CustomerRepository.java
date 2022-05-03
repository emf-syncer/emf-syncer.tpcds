package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tpcds.domain.lazy.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String>{
	Customer findBycCustomerId(String cCustomerId);
	
	@Query(value ="SELECT c FROM Customer c LEFT JOIN FETCH c.storeReturns WHERE c.cCustomerSk = ?1")
	Customer findByCCustomerSk(Long cCustomerSk);
	
//	@Query(value = "WITH customer_total_return as (select sr_customer_sk as ctr_customer_sk,sr_store_sk as ctr_store_sk, sum(sr_return_amt) AS ctr_total_return FROM store_returns, date_dim WHERE sr_customer_sk is not null and sr_store_sk is not null AND sr_returned_date_sk = d_date_sk AND d_year = 2000 GROUP BY sr_customer_sk,sr_store_sk) SELECT c.* from customer_total_return ctr1,store s,customer c WHERE ctr1.ctr_total_return > (select avg(ctr2.ctr_total_return)*1.2 FROM customer_total_return ctr2 WHERE ctr1.ctr_store_sk = ctr2.ctr_store_sk) AND s.s_store_sk = ctr1.ctr_store_sk AND s.s_state = 'TN' AND ctr1.ctr_customer_sk = c.c_customer_sk ORDER BY c.c_customer_id", nativeQuery=true)
//	List<Customer> findCustomersQuery();
}
