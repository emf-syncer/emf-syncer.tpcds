package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.DbgenVersion;

public interface DbgenVersionRepository extends JpaRepository<DbgenVersion,Long>{

}
