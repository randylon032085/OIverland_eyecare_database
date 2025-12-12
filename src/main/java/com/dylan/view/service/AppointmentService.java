package com.dylan.view.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dylan.view.dto.appointment.request.AppointmentCreateRequest;
import com.dylan.view.dto.appointment.response.AppointmentResponse;
import com.dylan.view.model.Appointment;
import com.dylan.view.model.Patients;
import com.dylan.view.model.Staff;
import com.dylan.view.repositories.AppointmentRepository;
import com.dylan.view.repositories.PatientsRepository;
import com.dylan.view.repositories.StaffRepository;
import com.dylan.view.utilmapper.AppointmentMapper;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepo;

    @Autowired
    private PatientsRepository patientRepo;

    @Autowired
    private StaffRepository staffRepo;

    @Transactional(readOnly = true)
    public Page<AppointmentResponse> getAllApointment(Pageable pageable) {
        return appointmentRepo.findAll(pageable).map(AppointmentMapper::toDto);
    }

    @Transactional
    public AppointmentResponse createAppointment(AppointmentCreateRequest appointmentCreateRequest) {
        Appointment newAppointment = AppointmentMapper.toEntity(appointmentCreateRequest);

        Patients patient = patientRepo.findById(appointmentCreateRequest.getPatient_id())
                .orElseThrow(
                        () -> new RuntimeException("Patient not found id" + appointmentCreateRequest.getPatient_id()));
        newAppointment.setPatients(patient);

        Staff staff = staffRepo.findById(appointmentCreateRequest.getStaff_id())
                .orElseThrow(
                        () -> new RuntimeException("Staff not found id " + appointmentCreateRequest.getStaff_id()));
        newAppointment.setStaff(staff);

        Appointment savAppointment = appointmentRepo.save(newAppointment);

        return AppointmentMapper.toDto(savAppointment);
    }
}
