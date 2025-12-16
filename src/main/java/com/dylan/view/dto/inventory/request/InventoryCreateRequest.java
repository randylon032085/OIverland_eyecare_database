package com.dylan.view.dto.inventory.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryCreateRequest {
    
    @NotNull
    private int categoryId;

    @NotBlank
    private String itemName;

    @NotBlank
    private String brand;

    @NotNull
    private double costPrice;

    @NotNull
    private double sellingPrice;

    @NotNull
    private int stock;
}
