package com.dylan.view.dto.patients.request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientsCreateRequest {
    
    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    @NotNull
    private LocalDateTime dateOfBirth;

    @NotBlank
    private String gender;

    @NotNull
    private long phone;

    @NotBlank
    private String email;

    @NotBlank
    private String address;

    @NotNull
    private LocalDateTime createdAt;
}
