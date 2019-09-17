package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.StoreSales;
import tpcds.domain.lazy.StoreSalesId;

public interface StoreSalesRepository extends JpaRepository<StoreSales,StoreSalesId>{

}
