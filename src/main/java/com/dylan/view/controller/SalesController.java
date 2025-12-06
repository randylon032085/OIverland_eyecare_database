package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.sales_item.response.SalesResponse;
import com.dylan.view.service.SalesService;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesServ;


    @GetMapping
    public ResponseEntity<Page<SalesResponse>>getAllSales(Pageable pageable){
        return ResponseEntity.ok(salesServ.getAllSales(pageable));
    }
    
}
