package com.tpzero.Prime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    @Test
    public void testIsPrimeForZero() {
        boolean result = Prime.isPrime(0);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPrimeForOne() {
        boolean result = Prime.isPrime(1);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsPrimeForPrimeNumber() {
        boolean result = Prime.isPrime(7);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPrimeForNonPrimeNumber() {
        boolean result = Prime.isPrime(10);
        Assertions.assertFalse(result);
    }
}
