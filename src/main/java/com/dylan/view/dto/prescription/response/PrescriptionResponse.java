package com.dylan.view.dto.prescription.response;

import java.time.LocalDate;

import com.dylan.view.dto.eye_exam.request.response.EyeExamResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionResponse {

    private String prescriptionType;
    private EyeExamResponse eyeExam;
    private LocalDate validUntil;
    private String remarks;
}
