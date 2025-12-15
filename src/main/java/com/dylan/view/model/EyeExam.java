package com.dylan.view.model;

import java.time.LocalDate;
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
@Table(name = "eye_exam")
public class EyeExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "appointments_id", referencedColumnName = "id")
    private Appointment appointment;

    @Column(name = "right_eye_sphere")
    private double rightEyeSphere;

    @Column(name = "right_eye_cylinder")
    private double rightEyeCylinder;

    @Column(name = "right_eye_axis")
    private int rightEyeAxis;

    @Column(name = "left_eye_sphere")
    private double leftEyeSphere;

    @Column(name = "left_eye_cylinder")
    private double leftEyeCylinder;

    @Column(name = "left_eye_axis")
    private int leftEyeAxis;

    @Column(name = "pd")
    private double pd;

    @Column(name = "exam_notes")
    private String examNotes;

    @Column(name = "exam_date")
    private LocalDate examDate;

    @OneToOne(mappedBy = "eyeExam")
    private Prescription prescription;
}
