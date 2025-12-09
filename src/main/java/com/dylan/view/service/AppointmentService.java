package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.appointment.response.AppointmentResponse;
import com.dylan.view.repositories.AppointmentRepository;
import com.dylan.view.utilmapper.AppointmentMapper;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepo;

    @Transactional(readOnly = true)
    public Page<AppointmentResponse> getAllApointment(Pageable pageable) {
        return appointmentRepo.findAll(pageable).map(AppointmentMapper::toDto);
    }
}
