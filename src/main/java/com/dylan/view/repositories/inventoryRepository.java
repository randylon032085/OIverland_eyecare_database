package com.dylan.view.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Inventory;

public interface inventoryRepository extends JpaRepository<Inventory, Integer> {
    

    Page<Inventory> findByCategoryNameContaining(String Name, Pageable pageable);

    Page<Inventory> findByItemNameContaining(String itemName, Pageable pageable );

    Page<Inventory> findByBrandContaining(String brand, Pageable oPageable);
}
