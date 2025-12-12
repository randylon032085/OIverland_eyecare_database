package com.dylan.view.utilmapper;

import com.dylan.view.dto.staff.request.StaffCreateRequest;
import com.dylan.view.dto.staff.response.StaffResponse;
import com.dylan.view.model.Staff;

public class StaffMapper {

    public static StaffResponse toDto(Staff staff){
        if(staff == null)return null;

        return new StaffResponse(
            staff.getFirstname(),
            staff.getLastname(),
            staff.getPhone(),
            staff.getEmail(),
            staff.getHiredDate(),

            RolesMapper.toDto(staff.getRoles())
        );
    }

    public static Staff toEntity (StaffCreateRequest staffCreateRequest){
        if(staffCreateRequest == null) return null;

        Staff staff = new Staff();

        staff.setFirstname(staffCreateRequest.getFirstname());
        staff.setLastname(staffCreateRequest.getLastname());
        staff.setPhone(staffCreateRequest.getPhone());
        staff.setEmail(staffCreateRequest.getEmail());
        staff.setHiredDate(staffCreateRequest.getHiredDate());

        return staff;
    }
}
