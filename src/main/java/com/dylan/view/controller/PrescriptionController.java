package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.prescription.request.PrescriptionCreateRequest;
import com.dylan.view.dto.prescription.response.PrescriptionResponse;
import com.dylan.view.service.PrescriptioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    @Autowired
    private PrescriptioService prescriptionServ;

    @GetMapping
    public ResponseEntity<Page<PrescriptionResponse>> getAllPrescription(Pageable pageable) {
        return ResponseEntity.ok(prescriptionServ.getAllPrescription(pageable));
    }

    @PostMapping
    public ResponseEntity<PrescriptionResponse> createPrescription(
            @Valid @RequestBody PrescriptionCreateRequest prescriptionCreateRequest) {
        PrescriptionResponse createNewPrescription = prescriptionServ.createPrescription(prescriptionCreateRequest);

        return ResponseEntity.ok(createNewPrescription);
    }

}
