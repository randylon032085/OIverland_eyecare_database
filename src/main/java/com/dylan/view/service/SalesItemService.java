package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.sales_item.response.SalesItemResponse;
import com.dylan.view.repositories.SalesItemRepository;
import com.dylan.view.utilmapper.SalesItemMMapper;

@Service
public class SalesItemService {
    
    @Autowired
    private SalesItemRepository salesItemRepo;

    @Transactional(readOnly=true)
    public Page<SalesItemResponse>getAllSalesItem(Pageable pageable){
        return salesItemRepo.findAll(pageable).map(SalesItemMMapper::toDto);
    }

}
