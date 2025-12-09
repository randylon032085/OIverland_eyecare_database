package com.dylan.view.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.prescription.response.PrescriptionResponse;
import com.dylan.view.service.PrescriptioService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    @Autowired
    private PrescriptioService prescriptionServ;

    @GetMapping
    public ResponseEntity<Page<PrescriptionResponse>>getAllPrescription(Pageable pageable){
        return ResponseEntity.ok(prescriptionServ.getAllPrescription(pageable));
    }
    
}
