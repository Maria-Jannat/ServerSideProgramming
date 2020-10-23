/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesurazure;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TraineeController {

    private Trainee trainee;
    private String[] completedCourse;
    private String result;
    private List<Trainee> trainees;
    TraineeService service = new TraineeService();

    public void saveTrainee() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < completedCourse.length; i++) {
            sb.append(completedCourse[i] + " ");
        }
        trainee.setCompletedCourse(sb.toString());
        service.save(trainee);
        result = "Inserted Successfully";
    }

    public void updateTrainee() {
        service.update(trainee);
        result = "Updated Successfully";
    }

    public void deleteTrainee(int id) {
        service.del(new Trainee(id));
        result = "Deleted Successfully";
    }

    public void displayTrainee(int id) {
        trainee = service.getById(id);
    }

    public Trainee getTrainee() {
        if (trainee == null) {
            trainee = new Trainee();
        }
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Trainee> getTrainees() {
        trainees = service.getAll();
        return trainees;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    public TraineeService getService() {
        return service;
    }

    public void setService(TraineeService service) {
        this.service = service;
    }

    public String[] getCompletedCourse() {
        return completedCourse;
    }

    public void setCompletedCourse(String[] completedCourse) {
        this.completedCourse = completedCourse;
    }

}
