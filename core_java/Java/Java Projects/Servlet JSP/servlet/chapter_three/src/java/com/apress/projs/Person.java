package com.apress.projs;

public class Person {

    private String name;
    private int age;
    private Address address;

    public Person() {
        setName("Emre Aydin");
        setAge(37);

        this.address = new Address();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
