package profesional.test;


import org.junit.Test;



import static org.junit.Assert.*;

public class LargestAdjacentSumTest {



    @Test
    public void largestAdjacentSum() {
        assertEquals(7,LargestAdjacentSum.largestAdjacentSum(new int[]{1, 2, 3, 4}));
        assertEquals(6,LargestAdjacentSum.largestAdjacentSum(new int[]{18, -12, 9, -10}));
        assertEquals(2,LargestAdjacentSum.largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        assertEquals(3,LargestAdjacentSum.largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }

}