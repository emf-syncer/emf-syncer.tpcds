package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.CatalogReturns;
import tpcds.domain.lazy.CatalogReturnsId;

public interface CatalogReturnsRepository extends JpaRepository<CatalogReturns,CatalogReturnsId>{

}
