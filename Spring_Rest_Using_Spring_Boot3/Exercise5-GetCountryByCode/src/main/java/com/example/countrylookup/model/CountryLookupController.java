package com.example.countrylookup.controller;

import com.example.countrylookup.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryLookupController {

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {

        if (code.equalsIgnoreCase("IN")) {
            return new Country("IN", "India");
        }

        if (code.equalsIgnoreCase("US")) {
            return new Country("US", "United States");
        }

        if (code.equalsIgnoreCase("JP")) {
            return new Country("JP", "Japan");
        }

        return new Country("NA", "Country Not Found");
    }
}