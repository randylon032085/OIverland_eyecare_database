package com.dylan.view.dto.inventory.response;

import com.dylan.view.dto.category.response.CategoryResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryResponse {
    
    private CategoryResponse category;
    private String itemName;
    private String brand;
    private double costPrice;
    private double sellingPrice;
    private int stock;
}
