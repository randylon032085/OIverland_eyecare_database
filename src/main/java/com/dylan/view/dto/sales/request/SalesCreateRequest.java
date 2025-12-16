package com.dylan.view.dto.sales.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesCreateRequest {
    
    @NotNull
    private int patientId;
    
    @NotNull
    private int staffId;
  
    @NotNull
    private double totalAmount;
}
