package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.staff.request.StaffCreateRequest;
import com.dylan.view.dto.staff.request.StaffUpdateRequest;
import com.dylan.view.dto.staff.response.StaffResponse;
import com.dylan.view.service.StaffService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffServ;

    @GetMapping
    public ResponseEntity<Page<StaffResponse>>getAllStaff(Pageable pageable){
        return ResponseEntity.ok(staffServ.getAllStaff(pageable));
    }

    @PostMapping
    public ResponseEntity<StaffResponse>createStaff(@Valid @RequestBody StaffCreateRequest staffCreateRequest){
        StaffResponse createNewStaff = staffServ.createStaff(staffCreateRequest);
        return ResponseEntity.ok(createNewStaff);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StaffResponse>updateStaff(@PathVariable int id, @RequestBody StaffUpdateRequest staffUpdateRequest){
        StaffResponse updatedStaff = staffServ.updateStaff(id, staffUpdateRequest);
        return ResponseEntity.ok(updatedStaff);
    }
    
}
