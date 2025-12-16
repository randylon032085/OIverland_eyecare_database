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

import com.dylan.view.dto.category.request.CategoryCreateRequest;
import com.dylan.view.dto.category.response.CategoryResponse;
import com.dylan.view.service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryServ;

    @GetMapping
    public ResponseEntity<Page<CategoryResponse>>getAllCategory(Pageable pageable){
        return ResponseEntity.ok(categoryServ.getAllCategory(pageable));
    }

    @PostMapping
    public ResponseEntity<CategoryResponse>createCategory(@Valid @RequestBody CategoryCreateRequest categoryCreateRequest){
        CategoryResponse createNewCategory = categoryServ.createCategory(categoryCreateRequest);
        return ResponseEntity.ok(createNewCategory);
    }
}
