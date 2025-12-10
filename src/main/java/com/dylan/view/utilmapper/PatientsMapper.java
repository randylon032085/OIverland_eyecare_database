package com.dylan.view.utilmapper;

import com.dylan.view.dto.patients.reponse.PatientsResponse;
import com.dylan.view.dto.patients.request.PatientsCreateRequest;
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

    public static Patients toEntity(PatientsCreateRequest patientsCreateRequest){
        if(patientsCreateRequest == null)return null;
        Patients patients = new Patients();
        patients.setFirstname(patientsCreateRequest.getFirstname());
        patients.setLastname(patientsCreateRequest.getLastname());
        patients.setDateOfBirth(patientsCreateRequest.getDateOfBirth());
        patients.setGender(patientsCreateRequest.getGender());
        patients.setPhone(patientsCreateRequest.getPhone());
        patients.setEmail(patientsCreateRequest.getEmail());
        patients.setAddress(patientsCreateRequest.getAddress());

        return patients;
    }
    
}
