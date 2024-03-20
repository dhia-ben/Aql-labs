package com.tpzero.Fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void testFibonacciZero() {
        int result = Fibonacci.fibonacci(0);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testFibonacciFirstNumber() {
        int result = Fibonacci.fibonacci(1);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testFibonacciPositiveNumber() {
        int result = Fibonacci.fibonacci(6);
        Assertions.assertEquals(8, result);
    }
}
