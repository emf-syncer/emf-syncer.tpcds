package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse,Long>{

}
