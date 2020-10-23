package com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "c_name")
    private String name;

    private String remark;

    @OneToOne
    @JoinColumn(unique = true)
    private Office office;
}
