package com.dylan.view.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="prescription")
public class Prescription {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="prescription_type")
    private String prescriptionType;

    @OneToOne
    @JoinColumn(name="eye_exam_id", referencedColumnName="id")
    private EyeExam eyeExam;

    @Column(name="valid_until")
    private LocalDate validUntil;

    @Column(name="remarks")
    private String remarks;
}
