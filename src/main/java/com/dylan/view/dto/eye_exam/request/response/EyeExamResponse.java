package com.dylan.view.dto.eye_exam.request.response;

import java.time.LocalDate;

import com.dylan.view.dto.appointment.response.AppointmentResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EyeExamResponse {

    private AppointmentResponse appointment;
    private double rightEyeSphere;
    private double rightEyeCylinder;
    private int rightEyeAxis;
    private double leftEyeSphere;
    private double leftEyeCylinder;
    private int leftEyeAxis;
    private double pd;
    private String examNotes;
    private LocalDate examDate;
}
