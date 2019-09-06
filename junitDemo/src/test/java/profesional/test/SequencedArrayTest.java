package profesional.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequencedArrayTest {

    @Test
    public void isSequencedArray() {
        assertEquals(1, SequencedArray.isSequencedArray(new int[]{1, 2, 3, 4, 5},1,5));
        assertEquals(0,SequencedArray.isSequencedArray(new int[]{1, 3, 4, 2, 5},1,5));
        assertEquals(1,SequencedArray.isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2},-5,-2));
        assertEquals(0,SequencedArray.isSequencedArray(new int[]{0, 1, 2, 3, 4, 5},1,5));
        assertEquals(0,SequencedArray.isSequencedArray(new int[]{1, 2, 3, 4},1,5));
        assertEquals(0,SequencedArray.isSequencedArray(new int[]{1, 2, 5},1,5));
        assertEquals(0,SequencedArray.isSequencedArray(new int[]{5, 4, 3, 2, 1},1,5));
    }
}