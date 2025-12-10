package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.inventory.response.InventoryResponse;
import com.dylan.view.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    
    @Autowired
    private InventoryService inventoryServ;

    @GetMapping
    public ResponseEntity<Page<InventoryResponse>>getAllInventory(Pageable pageable){
        return ResponseEntity.ok(inventoryServ.getAllInventory(pageable));
    }
}
