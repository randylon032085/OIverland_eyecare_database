package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.sales_item.response.SalesItemResponse;
import com.dylan.view.service.SalesItemService;

@RestController
@RequestMapping("/sale_item")
public class SalesItemController {

    @Autowired
    private SalesItemService salesItemServ;

    @GetMapping
    public ResponseEntity<Page<SalesItemResponse>>getAllSalesItem(Pageable pageable){
        return ResponseEntity.ok(salesItemServ.getAllSalesItem(pageable));
    }
    
}
