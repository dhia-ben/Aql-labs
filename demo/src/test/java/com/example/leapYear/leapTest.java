package com.example.leapYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class leapTest {
    @Test
    public void divisibleByFourAndNotHundernd() {
        LeapYear roman = new LeapYear();
        boolean result = roman.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void divisibleByFourAndNotHunderndAndFourHundernd(){
        LeapYear roman = new LeapYear();
        boolean result = roman.isLeapYear(2020);
        Assertions.assertTrue(result);
    }

    @Test
    public void notDivisibleByFour(){
        LeapYear roman = new LeapYear();
        boolean result = roman.isLeapYear(2017);
        Assertions.assertFalse(result);

    }

    @Test
    public void divisibleByFourAndNotHunderndAndNotFourHundernd(){
        LeapYear roman = new LeapYear();
        boolean result = roman.isLeapYear(1500);
        Assertions.assertFalse(result);

    }
}
