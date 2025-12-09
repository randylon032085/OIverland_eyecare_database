package com.dylan.view.utilmapper;

import com.dylan.view.dto.prescription.response.PrescriptionResponse;
import com.dylan.view.model.Prescription;

public class PrescriptionMapper {
    
    public static PrescriptionResponse toDto (Prescription prescription){
        if(prescription == null ) return null;
        return new PrescriptionResponse(
            prescription.getPrescriptionType(),
            EyeExamMapper.toDto(prescription.getEyeExam()),
            prescription.getValidUntil(),
            prescription.getRemarks()
        );
    }
}
