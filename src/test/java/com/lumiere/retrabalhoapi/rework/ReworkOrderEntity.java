package com.lumiere.retrabalhoapi.rework;

import com.lumiere.retrabalhoapi.employee.EmployeeEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class ReworkOrderEntity {

    // Entry
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String orderNumber;
    private String operatorId;

    private LocalDate entryAt;

    @ManyToOne
    private Product product;


    @Enumerated(EnumType.STRING)
    private NonConformityCode nonConformityCode;

    @Enumerated(EnumType.STRING)
    private Operation operation;

    @Enumerated(EnumType.STRING)
    private Department department;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private Status status;



}
