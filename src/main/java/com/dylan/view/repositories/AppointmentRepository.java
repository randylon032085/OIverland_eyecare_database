package com.dylan.view.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    
}
