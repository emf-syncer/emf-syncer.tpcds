package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.DateDim;

public interface DateDimRepository extends JpaRepository<DateDim,Long>{

}
