package com.dylan.view.dto.eye_exam.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EyeExamCreateRequest {

    @NotNull
    private int appointments_id;

    @NotNull
    private double rightEyeSphere;

    @NotNull
    private double rightEyeCylinder;

    @NotNull
    private int rightEyeAxis;

    @NotNull
    private double leftEyeSphere;

    @NotNull
    private double leftEyeCylinder;

    @NotNull
    private int leftEyeAxis;

    @NotNull
    private double pd;

    @NotBlank
    private String examNotes;

    @NotNull
    private LocalDate examDate;

}
