package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.staff.response.StaffResponse;
import com.dylan.view.repositories.StaffRepository;
import com.dylan.view.utilmapper.StaffMapper;

@Service
public class StaffService {
    
    @Autowired
    private StaffRepository staffRepo;

    @Transactional(readOnly=true)
    public Page<StaffResponse>getAllStaff(Pageable pageable){
        return staffRepo.findAll(pageable).map(StaffMapper::toDto);
    }
}
