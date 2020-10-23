package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OfficeType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ot_name")
    private String name;

    @OneToOne
    @JoinColumn(unique = true)
    private Office office;
}
