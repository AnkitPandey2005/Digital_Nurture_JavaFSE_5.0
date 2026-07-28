package com.example.junit;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isNameAvailable() {
        return name != null;
    }
}