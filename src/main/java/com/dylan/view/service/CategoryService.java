package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.category.response.CategoryResponse;
import com.dylan.view.repositories.CategoryRepository;
import com.dylan.view.utilmapper.CategoryMapper;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    @Transactional(readOnly=true)
    public Page<CategoryResponse> getAllCategory(Pageable pageable){
        return categoryRepo.findAll(pageable).map(CategoryMapper::toDto);
    }
    
}
