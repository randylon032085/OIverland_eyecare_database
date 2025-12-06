package com.dylan.view.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Patients;

public interface PatientsRepository extends JpaRepository<Patients, Integer> {
    
    Page<Patients> findByLastnameContaining(String patientsLastname, Pageable pageable);
}
