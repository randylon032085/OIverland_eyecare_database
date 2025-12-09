package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.prescription.response.PrescriptionResponse;
import com.dylan.view.repositories.PrescriptionRepository;
import com.dylan.view.utilmapper.PrescriptionMapper;



@Service
public class PrescriptioService {
    
    @Autowired
    private PrescriptionRepository prescriptionRepo;

    @Transactional(readOnly=true)
    public Page<PrescriptionResponse> getAllPrescription(Pageable pageable){
        return prescriptionRepo.findAll(pageable).map(PrescriptionMapper::toDto);
    }
}
