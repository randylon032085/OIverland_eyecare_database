package com.dylan.view.utilmapper;

import com.dylan.view.dto.patients.reponse.PatientsResponse;
import com.dylan.view.model.Patients;

public class PatientsMapper {

    public static PatientsResponse toDto(Patients patients){
        if(patients == null) return null;

        return new PatientsResponse(
            patients.getFirstname(),
            patients.getLastname(),
            patients.getDateOfBirth(),
            patients.getGender(),
            patients.getPhone(),
            patients.getEmail(),
            patients.getAddress(),
            patients.getCreatedAt()

        );
    }
    
}
