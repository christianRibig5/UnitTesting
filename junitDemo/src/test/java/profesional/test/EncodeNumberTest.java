package profesional.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeNumberTest {

    @Test
    public void encodeNumber() {
        assertArrayEquals(new int[]{2}, EncodeNumber.encodeNumber(2));
        assertArrayEquals(new int[]{2,3},EncodeNumber.encodeNumber(6));
        assertArrayEquals(new int[]{2,7},EncodeNumber.encodeNumber(14));
        assertArrayEquals(new int[]{2,2,2,2,3,5,5},EncodeNumber.encodeNumber(1200));
        assertArrayEquals(null,EncodeNumber.encodeNumber(1));
        assertArrayEquals(null,EncodeNumber.encodeNumber(-18));

    }
}