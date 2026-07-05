package com.example.addcountry;

import com.example.addcountry.entity.Country;
import com.example.addcountry.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise5AddCountryApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(Exercise5AddCountryApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Country country = new Country("AU", "Australia");

        countryService.addCountry(country);

        System.out.println("Country added successfully.");

    }
}