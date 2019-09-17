package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.Promotion;

public interface PromotionRepository extends JpaRepository<Promotion,Long>{

}
