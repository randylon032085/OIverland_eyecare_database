package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.staff.response.StaffResponse;
import com.dylan.view.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffServ;

    @GetMapping
    public ResponseEntity<Page<StaffResponse>>getAllStaff(Pageable pageable){
        return ResponseEntity.ok(staffServ.getAllStaff(pageable));
    }
    
}
