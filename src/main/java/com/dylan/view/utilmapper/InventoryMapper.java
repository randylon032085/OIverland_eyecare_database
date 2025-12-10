package com.dylan.view.utilmapper;

import com.dylan.view.dto.inventory.response.InventoryResponse;
import com.dylan.view.model.Inventory;

public class InventoryMapper {
    
    public static InventoryResponse toDto(Inventory inventory){
        if(inventory == null)return null;
        return new InventoryResponse(
            CategoryMapper.toDto(inventory.getCategory()),
            inventory.getItemName(),
            inventory.getBrand(),
            inventory.getCostPrice(),
            inventory.getSellingPrice(),
            inventory.getStock()
        );
    }
}
