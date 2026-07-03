package com.example.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Starting Test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test Completed");
    }

    @Test
    public void testAddition() {
        int firstValue = 12;
        int secondValue = 18;
        int result = calculator.add(firstValue, secondValue);
        assertEquals(30, result);

    }

}