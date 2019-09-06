package profesional.test;

import org.junit.Test;


import static org.junit.Assert.*;

public class ConcatenatedSumTest {

    @Test
    public void checkConcatenatedSum() {
        assertEquals(1, ConcatenatedSum.checkConcatenatedSum(198,2));
        assertEquals(0,ConcatenatedSum.checkConcatenatedSum(198,3));
        assertEquals(1,ConcatenatedSum.checkConcatenatedSum(2997,3));
        assertEquals(0,ConcatenatedSum.checkConcatenatedSum(2997,2));
        assertEquals(1,ConcatenatedSum.checkConcatenatedSum(13332,4));
        assertEquals(1,ConcatenatedSum.checkConcatenatedSum(9,1));
    }
}