package profesional.test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LargestTest{

    @Test
    public void largestTest() {
        assertEquals(9, Largest.largest(new int[]{7,9,8}));
        assertEquals(8,Largest.largest(new int[]{8,7,8}));
        assertEquals(-4,Largest.largest(new int[]{-7,-4,-8}));
        assertEquals(0,Largest.largest(new int[]{}));
        assertEquals(1,Largest.largest(new int[]{1,1}));
        assertEquals(-7,Largest.largest(new int[]{-9,-8,-7}));
    }

}