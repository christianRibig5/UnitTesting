package profesional.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPrimeFactorTest {

    @Test
    public void largestPrimeFactor() {
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(10));
        assertEquals(17,LargestPrimeFactor.largestPrimeFactor(6936));
        assertEquals(0,LargestPrimeFactor.largestPrimeFactor(1));
    }
}