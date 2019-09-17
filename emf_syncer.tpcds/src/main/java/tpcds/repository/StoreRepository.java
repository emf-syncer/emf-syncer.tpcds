package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.Store;

public interface StoreRepository extends JpaRepository<Store,Long>{

}
