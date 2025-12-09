package com.dylan.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dylan.view.dto.eye_exam.response.EyeExamResponse;
import com.dylan.view.service.EyeExamService;

@RestController
@RequestMapping("/eye_exam")
public class EyeExamController {

    @Autowired
    private EyeExamService eyeExamServ;

    @GetMapping
    public ResponseEntity<Page<EyeExamResponse>> createEyeExam(Pageable pageable) {
        return ResponseEntity.ok(eyeExamServ.createEyeExam(pageable));
    }

}
