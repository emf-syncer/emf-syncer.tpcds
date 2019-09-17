package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.CallCenter;

public interface CallCenterRepository extends JpaRepository<CallCenter,Long>{

}
