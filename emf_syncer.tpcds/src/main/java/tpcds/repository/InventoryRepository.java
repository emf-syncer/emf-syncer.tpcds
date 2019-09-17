package tpcds.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tpcds.domain.lazy.Inventory;
import tpcds.domain.lazy.InventoryId;

public interface InventoryRepository extends JpaRepository<Inventory,InventoryId>{
}
