package com.dylan.view.utilmapper;

import com.dylan.view.dto.inventory.request.InventoryCreateRequest;
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

    public static Inventory toEntity(InventoryCreateRequest inventoryCreateRequest){
        if(inventoryCreateRequest == null)return null;

        Inventory inventory = new Inventory();

        inventory.setItemName(inventoryCreateRequest.getItemName());
        inventory.setBrand(inventoryCreateRequest.getBrand());
        inventory.setCostPrice(inventoryCreateRequest.getCostPrice());
        inventory.setSellingPrice(inventoryCreateRequest.getSellingPrice());
        inventory.setStock(inventoryCreateRequest.getStock());

        return inventory;
    }
}
