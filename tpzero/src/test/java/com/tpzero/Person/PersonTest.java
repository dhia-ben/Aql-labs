package com.tpzero.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testGetFullName() {

        Person person = new Person("Dhia", "Benammar", 22);
        String fullName = person.getFullName();
        Assertions.assertEquals("Dhia Benammar", fullName);
    }

    @Test
    public void testIsAdult() {
        Person person = new Person("Dhia", "Benammar", 22);
        boolean isAdult = person.isAdult();
        Assertions.assertTrue(isAdult);
    }

    @Test
    public void testIsNotAdult() {
        Person person = new Person("Dhia", "Benammar", 17);
        boolean isAdult = person.isAdult();
        Assertions.assertFalse(isAdult);
    }
}