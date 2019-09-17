package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.HouseholdDemographics;

public interface HouseHoldDemographicsRepository extends JpaRepository<HouseholdDemographics,Long>{

}
