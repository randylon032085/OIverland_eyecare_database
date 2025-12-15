package com.dylan.view.dto.prescription.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrescriptionCreateRequest {

    @NotBlank
    private String prescriptionType;

    @NotNull
    private int eyeExam_id;

    @NotNull
    private LocalDate validUntil;

    @NotBlank
    private String remarks;

}
