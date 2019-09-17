package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.TimeDim;

public interface TimeDimRepository extends JpaRepository<TimeDim,Long>{

}
