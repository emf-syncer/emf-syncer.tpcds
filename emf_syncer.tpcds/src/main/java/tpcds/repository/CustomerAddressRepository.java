package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress,Long>{

}
