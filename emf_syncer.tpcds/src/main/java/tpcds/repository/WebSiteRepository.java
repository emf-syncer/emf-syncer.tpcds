package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.WebSite;

public interface WebSiteRepository extends JpaRepository<WebSite,Long>{

}
