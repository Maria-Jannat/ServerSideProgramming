package com.example.entity;

import javax.persistence.*;

@Entity
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Country country;

//    @OneToMany
//    private Department department;
}
