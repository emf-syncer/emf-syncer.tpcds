package tpcds.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import tpcds.domain.lazy.StoreReturns;
import tpcds.domain.lazy.StoreReturnsId;

public interface StoreReturnsRepository extends JpaRepository<StoreReturns,StoreReturnsId>, JpaSpecificationExecutor<StoreReturns>{
	@Query("SELECT sr FROM StoreReturns sr LEFT JOIN FETCH sr.srReturnedDateSk LEFT JOIN FETCH sr.srCustomerSk LEFT JOIN FETCH sr.srStoreSk")
	List<StoreReturns> findStoreReturnsWithFetch();
	
//	@Query(value = "select sr.* from customer c, store_returns sr where sr_customer_sk=?1 and sr_customer_sk=c_customer_sk", nativeQuery = true)
//	List<StoreReturns> findStoreReturnsByCustomerSk(Long srCustomerSk);
	
//	@Query(value = "SELECT * FROM store_returns GROUP BY sr_item_sk, sr_ticket_number HAVING COUNT(*) > 1", nativeQuery = true)
//	List<StoreReturns> findStoreReturnsGrouped();

}
