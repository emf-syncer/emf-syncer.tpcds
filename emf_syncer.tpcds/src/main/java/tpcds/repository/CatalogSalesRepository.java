package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.CatalogSales;
import tpcds.domain.lazy.CatalogSalesId;

public interface CatalogSalesRepository extends JpaRepository<CatalogSales,CatalogSalesId>{

}
