package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.Reason;

public interface ReasonRepository extends JpaRepository<Reason,Long>{

}
