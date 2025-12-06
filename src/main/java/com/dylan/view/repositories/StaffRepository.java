package com.dylan.view.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
    
}
