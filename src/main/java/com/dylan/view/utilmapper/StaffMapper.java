package com.dylan.view.utilmapper;

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
}
