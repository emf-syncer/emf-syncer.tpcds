package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.ShipMode;

public interface ShipModeRepository extends JpaRepository<ShipMode,Long>{

}
