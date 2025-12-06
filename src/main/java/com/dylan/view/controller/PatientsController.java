package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.patients.reponse.PatientsResponse;
import com.dylan.view.service.PatientsService;

@RestController
@RequestMapping("/patients")
public class PatientsController {

    @Autowired
    private PatientsService patientsService;

    @GetMapping
    public ResponseEntity<Page<PatientsResponse>>getAllPatients(Pageable pageable){
        return ResponseEntity.ok(patientsService.getAllPatients(pageable));
    }

    @GetMapping("by-patients")
    public ResponseEntity<Page<PatientsResponse>>getPatientsByLastname(String patientsLastname, Pageable pageable){
        return ResponseEntity.ok(patientsService.getPatientsByLastname(patientsLastname, pageable));
    }
    
}
