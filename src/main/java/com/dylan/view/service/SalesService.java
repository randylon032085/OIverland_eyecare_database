package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.sales.request.SalesCreateRequest;
import com.dylan.view.dto.sales.response.SalesResponse;
import com.dylan.view.model.Patients;
import com.dylan.view.model.Sales;
import com.dylan.view.model.Staff;
import com.dylan.view.repositories.PatientsRepository;
import com.dylan.view.repositories.SalesRepository;
import com.dylan.view.repositories.StaffRepository;
import com.dylan.view.utilmapper.SalesMapper;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepo;

    @Autowired
    private PatientsRepository patientRepo;

    @Autowired
    private StaffRepository staffRepo;

    @Transactional(readOnly = true)
    public Page<SalesResponse> getAllSales(Pageable pageable) {
        return salesRepo.findAll(pageable).map(SalesMapper::toDto);
    }

    @Transactional
    public SalesResponse createSales (SalesCreateRequest salesCreateRequest){
        Sales sales = SalesMapper.toEntity(salesCreateRequest);

        Patients patients = patientRepo.findById(salesCreateRequest.getPatientId())
        .orElseThrow(()-> new RuntimeException("Patients id not found : " + salesCreateRequest.getPatientId()));
        sales.setPatients(patients);

        Staff staff = staffRepo.findById(salesCreateRequest.getStaffId())
        .orElseThrow(()-> new RuntimeException("Staff id not found : " + salesCreateRequest.getStaffId()));
        sales.setStaff(staff);

        Sales saveSales = salesRepo.save(sales);

        return SalesMapper.toDto(saveSales);

    }

}
