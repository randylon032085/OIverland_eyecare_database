package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.dylan.view.dto.patients.reponse.PatientsResponse;
import com.dylan.view.dto.patients.request.PatientUpdateRequest;
import com.dylan.view.dto.patients.request.PatientsCreateRequest;
import com.dylan.view.model.Patients;
import com.dylan.view.repositories.PatientsRepository;
import com.dylan.view.utilmapper.PatientsMapper;

import jakarta.validation.Valid;

@Service
public class PatientsService {

    @Autowired
    private PatientsRepository patientsRepo;

    @Transactional(readOnly = true)
    public Page<PatientsResponse> getAllPatients(Pageable pageable) {
        return patientsRepo.findAll(pageable).map(PatientsMapper::toDto);

    }

    @Transactional(readOnly = true)
    public Page<PatientsResponse> getPatientsByLastname(String patientsLastname, Pageable pageable) {
        return patientsRepo.findByLastnameContaining(patientsLastname, pageable).map(PatientsMapper::toDto);
    }

    @Transactional
    public PatientsResponse createPatient(@Valid @RequestBody PatientsCreateRequest patientsCreateRequest){
        Patients currentPatients = PatientsMapper.toEntity(patientsCreateRequest);
        Patients saveNewPatients = patientsRepo.save(currentPatients);
        return PatientsMapper.toDto(saveNewPatients);
    }

    @Transactional
    public PatientsResponse updatePatient(int id, PatientUpdateRequest patientUpdateRequest){

        Patients patients = patientsRepo.findById(id)
        .orElseThrow(()-> new IllegalArgumentException("Patient id " + id  +"not found "));

        PatientsMapper.updateApply(patients, patientUpdateRequest);


        Patients savePatients = patientsRepo.save(patients);
        return PatientsMapper.toDto(savePatients);
    }

}
