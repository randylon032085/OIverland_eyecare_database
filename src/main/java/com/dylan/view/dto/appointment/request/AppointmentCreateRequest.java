package com.dylan.view.dto.appointment.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentCreateRequest {

    @NotNull
    private String statusId;

    @NotNull
    private int patient_id;

    @NotNull
    private int staff_id;

    @NotNull
    private LocalDate appointmentDate;

    @NotBlank
    private String notes;

}
