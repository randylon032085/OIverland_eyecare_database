package com.dylan.view.utilmapper;

import com.dylan.view.dto.sales_item.response.SalesItemResponse;
import com.dylan.view.model.SalesItem;

public class SalesItemMMapper {
    
    public static SalesItemResponse toDto(SalesItem salesItem){
        if(salesItem == null)return null;

        return new SalesItemResponse(
            SalesMapper.toDto(salesItem.getSales()),
            InventoryMapper.toDto(salesItem.getInventory()),
            salesItem.getQuantity(),
            salesItem.getPrice()
        );
    }
}
