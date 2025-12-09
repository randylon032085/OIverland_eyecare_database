package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.category.response.CategoryResponse;
import com.dylan.view.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryServ;

    @GetMapping
    public ResponseEntity<Page<CategoryResponse>>getAllCategory(Pageable pageable){
        return ResponseEntity.ok(categoryServ.getAllCategory(pageable));
    }
}
