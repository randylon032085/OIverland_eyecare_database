package com.dylan.view.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Inventory;

public interface inventoryRepository extends JpaRepository<Inventory, Integer> {
    
}
