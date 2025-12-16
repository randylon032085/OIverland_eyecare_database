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

import com.dylan.view.dto.sales.request.SalesCreateRequest;
import com.dylan.view.dto.sales.response.SalesResponse;
import com.dylan.view.service.SalesService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesServ;


    @GetMapping
    public ResponseEntity<Page<SalesResponse>>getAllSales(Pageable pageable){
        return ResponseEntity.ok(salesServ.getAllSales(pageable));
    }

    @PostMapping
    public ResponseEntity<SalesResponse>createSales(@Valid @RequestBody SalesCreateRequest salesCreateRequest){
        SalesResponse createNewSales = salesServ.createSales(salesCreateRequest);

        return ResponseEntity.ok(createNewSales);
    }
    
}
