package com.example.romanNumeral;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RomanNumeralTest {


    @Test
    public void single() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void withManyDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void withSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void withAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void withInvalidSubtractor() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VL");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void withInvalidChars() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("LOVE");
        Assertions.assertEquals(-1, result);
    }
}
