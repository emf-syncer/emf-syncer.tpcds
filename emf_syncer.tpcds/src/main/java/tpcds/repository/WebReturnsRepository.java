package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.WebReturns;
import tpcds.domain.lazy.WebReturnsId;

public interface WebReturnsRepository extends JpaRepository<WebReturns,WebReturnsId>{

}
