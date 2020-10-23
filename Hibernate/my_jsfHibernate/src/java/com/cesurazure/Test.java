package com.cesurazure;

public class Test {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student student = new Student("Maria", "43");
        service.save(student);
    }
}
