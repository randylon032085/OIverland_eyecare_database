package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.roles.response.RolesResponse;
import com.dylan.view.repositories.RolesRepository;
import com.dylan.view.utilmapper.RolesMapper;

@Service
public class RolesService {

    @Autowired
    private RolesRepository rolesRepository;

    @Transactional(readOnly=true)
    public Page<RolesResponse>getAllRoles(Pageable pageable){
        return rolesRepository.findAll(pageable).map(RolesMapper::toDto);
    }
    
}
