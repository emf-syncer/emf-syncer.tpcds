package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import tpcds.domain.lazy.StoreReturns;
import tpcds.domain.lazy.StoreReturnsId;

public interface StoreReturnsRepository extends JpaRepository<StoreReturns,StoreReturnsId>, JpaSpecificationExecutor<StoreReturns>{
}
