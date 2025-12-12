package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.staff.request.StaffCreateRequest;
import com.dylan.view.dto.staff.response.StaffResponse;
import com.dylan.view.model.Roles;
import com.dylan.view.model.Staff;
import com.dylan.view.repositories.RolesRepository;
import com.dylan.view.repositories.StaffRepository;
import com.dylan.view.utilmapper.StaffMapper;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepo;

    @Autowired
    private RolesRepository rolesRepo;

    @Transactional(readOnly = true)
    public Page<StaffResponse> getAllStaff(Pageable pageable) {
        return staffRepo.findAll(pageable).map(StaffMapper::toDto);
    }

    @Transactional
    public StaffResponse createStaff( StaffCreateRequest staffCreateRequest){
        Staff staff = StaffMapper.toEntity(staffCreateRequest);

        Roles roles = rolesRepo.findById(staffCreateRequest.getRole_id())
        .orElseThrow(()-> new RuntimeException("Role not found id: " + staffCreateRequest.getRole_id()));
        staff.setRoles(roles);

        Staff saveStaff = staffRepo.save(staff);

        return StaffMapper.toDto(saveStaff);

    }
}
