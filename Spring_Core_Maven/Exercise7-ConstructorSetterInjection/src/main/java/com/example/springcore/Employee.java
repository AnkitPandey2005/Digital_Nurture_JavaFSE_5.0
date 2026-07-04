package com.example.springcore;

public class Employee {

    private Department department;
    private String employeeName;

    public Employee(Department department) {
        this.department = department;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void displayDetails() {

        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department.getDepartmentName());

    }

}