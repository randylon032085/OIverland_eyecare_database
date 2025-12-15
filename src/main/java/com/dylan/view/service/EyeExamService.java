package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.eye_exam.request.EyeExamCreateRequest;
import com.dylan.view.dto.eye_exam.request.response.EyeExamResponse;
import com.dylan.view.model.Appointment;
import com.dylan.view.model.EyeExam;
import com.dylan.view.repositories.AppointmentRepository;
import com.dylan.view.repositories.EyeExamRepository;
import com.dylan.view.utilmapper.EyeExamMapper;

@Service
public class EyeExamService {

    @Autowired
    private EyeExamRepository examRepo;

    @Autowired
    private AppointmentRepository appointmentRepo;

    @Transactional(readOnly = true)
    public Page<EyeExamResponse> getAllEyeExam(Pageable pageable) {
        return examRepo.findAll(pageable).map(EyeExamMapper::toDto);

    }

    @Transactional
    public EyeExamResponse createEyeExam(EyeExamCreateRequest eyeExamCreateRequest) {
        if (eyeExamCreateRequest == null)
            return null;

        EyeExam eyeExam = EyeExamMapper.toEntity(eyeExamCreateRequest);

        Appointment appointment = appointmentRepo.findById(eyeExamCreateRequest.getAppointments_id())
                .orElseThrow(() -> new RuntimeException(
                        "Appointment not found id " + eyeExamCreateRequest.getAppointments_id()));

        eyeExam.setAppointment(appointment);

        EyeExam saveEyeExam = examRepo.save(eyeExam);

        return EyeExamMapper.toDto(saveEyeExam);
    }

}
