package com.company;

public class Student {
    private String name;
    private int age;

    public Student() {
        name = "";
        age = 0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("hi, my name is " + name + " and my age is " + age);
    }
}
