package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "o_name")
    private String name;

    @OneToOne
    @JoinColumn(unique = true)
    private Country country;
}
