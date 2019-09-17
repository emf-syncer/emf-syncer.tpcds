package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.IncomeBand;

public interface IncomeBandRepository extends JpaRepository<IncomeBand,Long>{

}
