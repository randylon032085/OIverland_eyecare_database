package com.dylan.view.dto.patients.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientUpdateRequest {
    
    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    @NotNull
    private LocalDate dateOfBirth;

    @NotBlank
    private String gender;

    @NotNull
    private long phone;

    @NotBlank
    private String email;

    @NotBlank
    private String address;
}
