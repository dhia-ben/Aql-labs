package com.tpzero.Factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void testFactorialZero() {
        int result = Factorial.factorial(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testFactorialPositiveNumber() {
        int result = Factorial.factorial(5);
        Assertions.assertEquals(120, result);
    }

    @Test
    public void testFactorialNegativeNumber() {
        try {
            Factorial.factorial(-5);
            // If no exception is thrown, fail the test
            Assertions.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // If IllegalArgumentException is thrown, the test passes
            Assertions.assertEquals("n must be positive", e.getMessage());
        }
    }
}

