package com.dylan.view.utilmapper;

import com.dylan.view.dto.appointment.response.AppointmentResponse;
import com.dylan.view.model.Appointment;

public class AppointmentMapper {

    public static AppointmentResponse toDto(Appointment appointment){

        if(appointment == null ) return null;

        return new AppointmentResponse(
            appointment.getStatusId(),
            PatientsMapper.toDto(appointment.getPatients()),
            StaffMapper.toDto(appointment.getStaff()),
            appointment.getAppointmentDate(),
            appointment.getNotes()
        );
    }
    
}
