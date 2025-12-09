package com.dylan.view.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Category;

public interface CategoryRepository extends  JpaRepository<Category, Integer>{
    
}
