package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.CatalogPage;

public interface CatalogPageRepository extends JpaRepository<CatalogPage,Long>{

}
