package com.dylan.view.dto.roles.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolesUpdateRequest {
    
    @NotBlank
    private String name;
}
