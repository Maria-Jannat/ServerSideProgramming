package com.cesurazure.bean;

import com.cesurazure.entity.Student;
import com.cesurazure.service.StudentService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class StudentController {
    
    private Student student;
    private String[] courseCompleted;
    private String result;
    StudentService service = new StudentService();
    private List<Student> students;
    
    public void saveStudent() {
        String cc = "";
        for (String s : courseCompleted) {
            cc += s + ", ";
        }
        student.setCompletedCourseName(cc);
        service.save(student);
        result = "Inserted Successfully";
    }
    
    public void displayUpdate(int id) {
        student = service.getById(id);
    }
    
    public void updateStudent() {
        service.update(student);
        result = "Updated Successsfully";
    }
    
    public void deleteStudent() {
        service.delete(student);
        result = "Deleted Successsfully";
    }
    
    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }
    
    public String getResult() {
        return result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }
    
    public StudentService getService() {
        return service;
    }
    
    public void setService(StudentService service) {
        this.service = service;
    }
    
    public List<Student> getStudents() {
        students = service.getAll();
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    
}
