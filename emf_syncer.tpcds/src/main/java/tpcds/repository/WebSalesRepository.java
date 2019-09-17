package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.WebSales;
import tpcds.domain.lazy.WebSalesId;

public interface WebSalesRepository extends JpaRepository<WebSales,WebSalesId>{

}
