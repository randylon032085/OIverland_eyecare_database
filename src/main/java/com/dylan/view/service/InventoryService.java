package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.inventory.request.InventoryCreateRequest;
import com.dylan.view.dto.inventory.response.InventoryResponse;
import com.dylan.view.model.Category;
import com.dylan.view.model.Inventory;
import com.dylan.view.repositories.CategoryRepository;
import com.dylan.view.repositories.inventoryRepository;
import com.dylan.view.utilmapper.InventoryMapper;

@Service
public class InventoryService { 
    
    @Autowired
    private inventoryRepository inventoryRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    @Transactional(readOnly=true)
    public Page<InventoryResponse>getAllInventory(Pageable pageable){
        return inventoryRepo.findAll(pageable).map(InventoryMapper::toDto);
    }

    @Transactional
    public InventoryResponse createInventory(InventoryCreateRequest inventoryCreateRequest){

        Inventory inventory = InventoryMapper.toEntity(inventoryCreateRequest);

        Category category = categoryRepo.findById(inventoryCreateRequest.getCategoryId())
        .orElseThrow(()-> new RuntimeException("Category not found id: " + inventoryCreateRequest.getCategoryId()));
        inventory.setCategory(category);

        Inventory saveInventory = inventoryRepo.save(inventory);

        return InventoryMapper.toDto(saveInventory);
    }
}
