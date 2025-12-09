package com.dylan.view.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Prescription;

public interface  PrescriptionRepository extends JpaRepository<Prescription, Integer> {
    
}
