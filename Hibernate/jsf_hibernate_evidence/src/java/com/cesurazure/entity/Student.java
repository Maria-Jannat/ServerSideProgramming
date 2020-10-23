package com.cesurazure.entity;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ogrenci")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String gender;
    private String email;
    private String round;
    private String completedCourseName;

    public Student() {
    }

    public Student(String name, String gender, String email, String round, String completedCourseName) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.round = round;
        this.completedCourseName = completedCourseName;
    }    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getCompletedCourseName() {
        return completedCourseName;
    }

    public void setCompletedCourseName(String completedCourseName) {
        this.completedCourseName = completedCourseName;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", round=" + round + ", completedCourseName=" + completedCourseName + '}';
    }

}
