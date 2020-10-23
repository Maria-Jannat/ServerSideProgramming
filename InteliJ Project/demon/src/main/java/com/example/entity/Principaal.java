package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Principaal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(unique = true)
    private College college;//college_id