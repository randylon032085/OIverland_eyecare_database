package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.inventory.request.InventoryCreateRequest;
import com.dylan.view.dto.inventory.response.InventoryResponse;
import com.dylan.view.service.InventoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    
    @Autowired
    private InventoryService inventoryServ;

    @GetMapping
    public ResponseEntity<Page<InventoryResponse>>getAllInventory(Pageable pageable){
        
        return ResponseEntity.ok(inventoryServ.getAllInventory(pageable));
            
    }
    @GetMapping("/by-name")
    public ResponseEntity<Page<InventoryResponse>>getInventoryByName(String Name, Pageable pageable){
        return ResponseEntity.ok(inventoryServ.getInventoryByName(Name, pageable));
    }

    @GetMapping("/by-itemname")
    public ResponseEntity<Page<InventoryResponse>>getInventoryByItemName(String itemName, Pageable pageable){
        return ResponseEntity.ok(inventoryServ.getInventoryByItemName(itemName, pageable));
    }

    @GetMapping("/by-brand")
    public ResponseEntity<Page<InventoryResponse>>getInventoryByBrand(String brand, Pageable pageable){
        return ResponseEntity.ok(inventoryServ.getInventoryByBrand(brand, pageable));
    }


    @PostMapping
    public ResponseEntity<InventoryResponse> createInventory (@Valid @RequestBody InventoryCreateRequest inventoryCreateRequest){
         System.out.println("postman");
        InventoryResponse createNewInventory = inventoryServ.createInventory(inventoryCreateRequest);
        
        return ResponseEntity.ok(createNewInventory);
    }
}
