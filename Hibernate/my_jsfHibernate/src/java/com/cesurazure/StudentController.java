package com.cesurazure;

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
        student.setCompletedCourse(cc);
        service.save(student);
        result = "Inserted Sucessfully";
        System.out.println("........Successs..............");
    }
    
    public void displayUpdate(int id) {
        student = service.getById(id);
    }
    
    public void updateStudent() {
        String cc = "";
        for (String s : courseCompleted) {
            cc += s + ", ";
        }
        student.setCompletedCourse(cc);
        service.update(student);
        result = "Updated Sucessfully";
        System.out.println("........Successs..............");
    }
    
    public void delete(int id) {
        service.delete(new Student(id));
        result = "Deleted Sucessfully";
    }
    
    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
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

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
}
