package com.dylan.view.controller;

import java.time.LocalDate;

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

import com.dylan.view.dto.patients.reponse.PatientsResponse;
import com.dylan.view.dto.patients.request.PatientUpdateRequest;
import com.dylan.view.dto.patients.request.PatientsCreateRequest;
import com.dylan.view.service.PatientsService;

import jakarta.validation.Valid;


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

    @GetMapping("by-firstname")
    public ResponseEntity<Page<PatientsResponse>>getPatientsByFirstname(String Firstname, Pageable pageable){
        return ResponseEntity.ok(patientsService.getPatientByFirstname(Firstname, pageable));
    }

    @GetMapping("by-dateOfBirth")
    public ResponseEntity<Page<PatientsResponse>>getPatientsByDateOfBirth(LocalDate DateOfBirth, Pageable pageable){
        return ResponseEntity.ok(patientsService.getPatientsByDateOfBirth(DateOfBirth, pageable));
    }

    @GetMapping("by-gender")
    public ResponseEntity<Page<PatientsResponse>>getPatientByGender(String Gender, Pageable pageable){
        return ResponseEntity.ok(patientsService.getPatientsByGender(Gender, pageable));
    }

    @PostMapping
    public ResponseEntity<PatientsResponse>createPatients(@Valid @RequestBody PatientsCreateRequest patientsCreateRequest){
        PatientsResponse createNewPatient = patientsService.createPatient(patientsCreateRequest);
        return ResponseEntity.ok(createNewPatient);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PatientsResponse>updatePatient(@PathVariable int id, @RequestBody PatientUpdateRequest patientUpdateRequest){
        PatientsResponse updatedPatients = patientsService.updatePatient(id, patientUpdateRequest);
        return ResponseEntity.ok(updatedPatients);
    }
    
    
}
