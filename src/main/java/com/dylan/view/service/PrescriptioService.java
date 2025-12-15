package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.prescription.request.PrescriptionCreateRequest;
import com.dylan.view.dto.prescription.response.PrescriptionResponse;
import com.dylan.view.model.EyeExam;
import com.dylan.view.model.Prescription;
import com.dylan.view.repositories.EyeExamRepository;
import com.dylan.view.repositories.PrescriptionRepository;
import com.dylan.view.utilmapper.PrescriptionMapper;

@Service
public class PrescriptioService {

    @Autowired
    private PrescriptionRepository prescriptionRepo;

    @Autowired
    private EyeExamRepository eyeExamRepo;

    @Transactional(readOnly = true)
    public Page<PrescriptionResponse> getAllPrescription(Pageable pageable) {
        return prescriptionRepo.findAll(pageable).map(PrescriptionMapper::toDto);
    }

    @Transactional
    public PrescriptionResponse createPrescription(PrescriptionCreateRequest prescriptionCreateRequest) {

        Prescription prescription = PrescriptionMapper.toEntity(prescriptionCreateRequest);

        EyeExam eyeExam = eyeExamRepo.findById(prescriptionCreateRequest.getEyeExam_id())
                .orElseThrow(() -> new RuntimeException(
                        "Prescription not found id " + prescriptionCreateRequest.getEyeExam_id()));
        prescription.setEyeExam(eyeExam);

        Prescription savePrescription = prescriptionRepo.save(prescription);

        return PrescriptionMapper.toDto(savePrescription);
    }
}
