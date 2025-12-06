package com.dylan.view.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="status_id")
    private String statusId;

    @OneToOne
    @JoinColumn(name="patient_id", referencedColumnName="id")
    private Patients patients;

    @ManyToOne
    @JoinColumn(name="staff_id", referencedColumnName="id")
    private Staff staff;

    @Column(name="appointment_date")
    private LocalDateTime appointmentDate;

    @Column(name="notes")
    private String notes;
    
}
