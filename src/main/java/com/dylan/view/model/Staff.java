package com.dylan.view.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "phone")
    private long phone;

    @Column(name = "email")
    @Email
    private String email;

    @Column(name = "hired_date")
    private LocalDate hiredDate;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Roles roles;

    @OneToMany(mappedBy = "staff")
    private List<Sales> sales;

    @OneToMany(mappedBy = "staff")
    private List<Appointment> appointment;
}
