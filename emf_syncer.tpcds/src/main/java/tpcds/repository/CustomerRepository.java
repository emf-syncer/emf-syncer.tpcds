package tpcds.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
	Customer findByCCustomerId(String cCustomerId);
}
