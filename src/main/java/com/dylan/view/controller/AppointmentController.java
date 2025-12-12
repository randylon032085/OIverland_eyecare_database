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

import com.dylan.view.dto.appointment.request.AppointmentCreateRequest;
import com.dylan.view.dto.appointment.response.AppointmentResponse;
import com.dylan.view.service.AppointmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentServ;

    @GetMapping
    public ResponseEntity<Page<AppointmentResponse>> getAllAppointment(Pageable pageable) {
        return ResponseEntity.ok(appointmentServ.getAllApointment(pageable));
    }

    @PostMapping
    public ResponseEntity<AppointmentResponse> createAppointment(
            @Valid @RequestBody AppointmentCreateRequest appointmentCreateRequest) {
        AppointmentResponse createNewAppointment = appointmentServ.createAppointment(appointmentCreateRequest);

        return ResponseEntity.ok(createNewAppointment);
    }

}
