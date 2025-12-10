package com.dylan.view.dto.sales.response;

import java.time.LocalDateTime;

import com.dylan.view.dto.patients.reponse.PatientsResponse;
import com.dylan.view.dto.staff.response.StaffResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesResponse {
    
    private PatientsResponse patients;
    private StaffResponse staff;
    private LocalDateTime saleDate;
    private double totalAmount;
}
