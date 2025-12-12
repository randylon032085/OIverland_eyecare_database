package com.dylan.view.dto.staff.request;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffCreateRequest {
    
    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    @NotNull
    private long phone;

    @NotBlank
    private String email;

    @NotNull
    private LocalDate hiredDate;
    
    @NotNull
    private int role_id;
}
