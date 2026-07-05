package com.example.countryxml;

import com.example.countryxml.model.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Exercise2LoadCountryFromXmlApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(Exercise2LoadCountryFromXmlApplication.class, args);

        Country country = context.getBean("country", Country.class);

        System.out.println("Country Details");

        System.out.println(country);

    }
}