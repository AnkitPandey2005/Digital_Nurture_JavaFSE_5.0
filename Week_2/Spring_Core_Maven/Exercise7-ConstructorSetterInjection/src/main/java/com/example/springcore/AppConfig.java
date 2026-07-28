package com.example.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Department department() {
        return new Department("Information Technology");
    }

    @Bean
    public Employee employee() {

        Employee employee = new Employee(department());

        employee.setEmployeeName("Ankit Pandey");

        return employee;

    }

}