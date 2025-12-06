package com.dylan.view.utilmapper;

import com.dylan.view.dto.sales_item.response.SalesResponse;
import com.dylan.view.model.Sales;

public class SalesMapper {

    public static SalesResponse toDto(Sales sales){
        if(sales == null )return null;

        return new SalesResponse(
            PatientsMapper.toDto(sales.getPatients()),
            StaffMapper.toDto(sales.getStaff()),
            sales.getSaleDate(),
            sales.getTotalAmount()
        );
    }
    
}
