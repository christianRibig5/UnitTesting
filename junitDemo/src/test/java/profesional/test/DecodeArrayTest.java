package profesional.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeArrayTest {

    @Test
    public void decodeArray() {
        assertEquals(3344,DecodeArray.decodeArray(new int[]{0, -3, 0, -4, 0}));
        assertEquals(-6392,DecodeArray.decodeArray(new int[]{-1, 5, 8, 17, 15}));
        assertEquals(4392,DecodeArray.decodeArray(new int[]{1, 5, 8, 17, 15}));
        assertEquals(4392,DecodeArray.decodeArray(new int[]{111, 115, 118, 127, 125}));
        assertEquals(0,DecodeArray.decodeArray(new int[]{1, 1}));
    }
}