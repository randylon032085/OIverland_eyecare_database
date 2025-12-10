package com.dylan.view.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.SalesItem;

public interface  SalesItemRepository extends JpaRepository<SalesItem, Integer> {
    
}
