package com.dylan.view.dto.patients.reponse;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientsResponse {


    private String firstname;

   
    private String lastname;


    private LocalDate dateOfBirth;

 
    private String gender;

 
    private long phone;

 
    private String email;

  
    private String address;

 
    private LocalDateTime createdAt;
    
}
