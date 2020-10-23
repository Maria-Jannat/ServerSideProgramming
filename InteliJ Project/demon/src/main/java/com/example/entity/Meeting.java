package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "c_name")
    private String name;


}
