package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.roles.response.RolesResponse;
import com.dylan.view.service.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController {

    @Autowired
    private RolesService rolesServ;

    @GetMapping
    private ResponseEntity<Page<RolesResponse>>getAllRoles(Pageable pageable){
        return ResponseEntity.ok(rolesServ.getAllRoles(pageable));
    }
    
}
