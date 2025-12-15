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

import com.dylan.view.dto.eye_exam.request.EyeExamCreateRequest;
import com.dylan.view.dto.eye_exam.request.response.EyeExamResponse;
import com.dylan.view.service.EyeExamService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/eye_exam")
public class EyeExamController {

    @Autowired
    private EyeExamService eyeExamServ;

    @GetMapping
    public ResponseEntity<Page<EyeExamResponse>> getAllEyeExam(Pageable pageable) {
        return ResponseEntity.ok(eyeExamServ.getAllEyeExam(pageable));
    }

    @PostMapping
    public ResponseEntity<EyeExamResponse> createEyeExam(@Valid @RequestBody EyeExamCreateRequest examCreateRequest) {
        EyeExamResponse createNewEyeExam = eyeExamServ.createEyeExam(examCreateRequest);

        return ResponseEntity.ok(createNewEyeExam);
    }

}
