package profesional.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CubePoweredTest {

    @Test
    public void isCubePowered() {
        assertEquals(1, CubePowered.isCubePowered(153));
        assertEquals(1,CubePowered.isCubePowered(370));
        assertEquals(1,CubePowered.isCubePowered(371));
        assertEquals(1,CubePowered.isCubePowered(407));
        assertEquals(0,CubePowered.isCubePowered(87));
        assertEquals(0,CubePowered.isCubePowered(0));
        assertEquals(0,CubePowered.isCubePowered(-81));
    }
}