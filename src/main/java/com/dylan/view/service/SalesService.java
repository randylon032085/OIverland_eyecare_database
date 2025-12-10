package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.sales.response.SalesResponse;
import com.dylan.view.repositories.SalesRepository;
import com.dylan.view.utilmapper.SalesMapper;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepo;

    @Transactional(readOnly = true)
    public Page<SalesResponse> getAllSales(Pageable pageable) {
        return salesRepo.findAll(pageable).map(SalesMapper::toDto);
    }

}
