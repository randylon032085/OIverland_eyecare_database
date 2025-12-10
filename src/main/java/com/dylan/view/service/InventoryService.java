package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.inventory.response.InventoryResponse;
import com.dylan.view.repositories.inventoryRepository;
import com.dylan.view.utilmapper.InventoryMapper;

@Service
public class InventoryService { 
    
    @Autowired
    private inventoryRepository inventoryRepo;

    @Transactional(readOnly=true)
    public Page<InventoryResponse>getAllInventory(Pageable pageable){
        return inventoryRepo.findAll(pageable).map(InventoryMapper::toDto);
    }
}
