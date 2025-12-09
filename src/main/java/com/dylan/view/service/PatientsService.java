package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.patients.reponse.PatientsResponse;
import com.dylan.view.repositories.PatientsRepository;
import com.dylan.view.utilmapper.PatientsMapper;

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

}
