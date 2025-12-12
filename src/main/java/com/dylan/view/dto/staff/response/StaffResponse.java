package com.dylan.view.dto.staff.response;

import java.time.LocalDate;

import com.dylan.view.dto.roles.response.RolesResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffResponse {

    
    private String firstname;
    private String lastname;
    private long phone;
    private String email;
    private LocalDate hiredDate;

    private RolesResponse roles;
    
}
