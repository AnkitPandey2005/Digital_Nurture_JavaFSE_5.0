package com.example.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testAssertions() {

        Student firstStudent = new Student("Rahul");

        assertEquals("Rahul", firstStudent.getName());

        assertTrue(firstStudent.isNameAvailable());

        assertFalse(firstStudent.getName().isEmpty());

        assertNotNull(firstStudent.getName());

        assertNull(null);
    }
}