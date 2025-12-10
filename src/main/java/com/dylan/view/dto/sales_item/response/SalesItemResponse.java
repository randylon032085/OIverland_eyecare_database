package com.dylan.view.dto.sales_item.response;

import com.dylan.view.dto.inventory.response.InventoryResponse;
import com.dylan.view.dto.sales.response.SalesResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesItemResponse {
    
    private SalesResponse sales;
    private InventoryResponse inventory;
    private int quantity;
    private double price;

}
