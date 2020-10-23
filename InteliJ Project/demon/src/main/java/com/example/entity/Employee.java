package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "c_name")
    private String name;
    private String email;
    private String position;
    private String department;
    private String status;
    private String remark;


}
