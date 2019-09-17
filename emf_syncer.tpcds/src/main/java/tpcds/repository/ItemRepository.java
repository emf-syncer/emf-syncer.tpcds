package tpcds.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.Item;

public interface ItemRepository extends JpaRepository<Item,Long>{

}
