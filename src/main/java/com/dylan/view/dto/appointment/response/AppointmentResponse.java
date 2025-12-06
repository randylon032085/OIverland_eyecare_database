package com.dylan.view.dto.appointment.response;

import java.time.LocalDateTime;

import com.dylan.view.dto.patients.reponse.PatientsResponse;
import com.dylan.view.dto.staff.response.StaffResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentResponse {

    private String statusId;
    private PatientsResponse patients;
    private StaffResponse staff;
    private LocalDateTime appointmentDate;
    private String notes;
    
}
