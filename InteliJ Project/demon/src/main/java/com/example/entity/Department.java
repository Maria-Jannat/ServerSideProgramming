package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "d_name")
    private String name;

    private String remark;

    @OneToOne
    @JoinColumn(unique = true)
    private Office office;
}
