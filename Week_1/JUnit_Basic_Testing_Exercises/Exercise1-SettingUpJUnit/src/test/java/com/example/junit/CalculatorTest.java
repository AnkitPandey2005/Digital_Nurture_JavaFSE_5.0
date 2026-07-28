package com.example.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator calculator = new Calculator();

        int sum = calculator.add(15, 25);

        assertEquals(40, sum);

    }
}