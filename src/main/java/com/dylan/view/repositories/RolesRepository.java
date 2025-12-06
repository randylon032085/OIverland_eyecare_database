package com.dylan.view.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dylan.view.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
    
}
