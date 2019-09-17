package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.WebPage;

public interface WebPageRepository extends JpaRepository<WebPage,Long>{

}
