package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.eye_exam.response.EyeExamResponse;
import com.dylan.view.repositories.EyeExamRepository;
import com.dylan.view.utilmapper.EyeExamMapper;

@Service
public class EyeExamService {

    @Autowired
    private EyeExamRepository examRepo;

    @Transactional(readOnly = true)
    public Page<EyeExamResponse> createEyeExam(Pageable pageable) {
        return examRepo.findAll(pageable).map(EyeExamMapper::toDto);

    }
}
