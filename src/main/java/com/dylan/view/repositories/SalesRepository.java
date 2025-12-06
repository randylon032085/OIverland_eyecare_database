package com.dylan.view.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Sales;

public interface  SalesRepository extends JpaRepository<Sales, Integer> {
    
}
