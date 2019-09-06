package profesional.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternMatchingTest {

    @Test
    public void matchPattern() {
        assertEquals(1, PatternMatching.matchPattern(new int[]{1, 1, 1, 1, 1},new int[]{1}));
        assertEquals(1,PatternMatching.matchPattern(new int[]{1},new int[]{1}));
        assertEquals(1,PatternMatching.matchPattern(new int[]{1, 1,2,2,2,2},new int[]{1,2}));
        assertEquals(0,PatternMatching.matchPattern(new int[]{1,2,3},new int[]{1,2}));
        assertEquals(0,PatternMatching.matchPattern(new int[]{1, 2},new int[]{1,2,3}));
        assertEquals(0,PatternMatching.matchPattern(new int[]{1, 1, 2, 2, 2, 2, 3},new int[]{1, 3}));
        assertEquals(0,PatternMatching.matchPattern(new int[]{1, 1, 1, 1},new int[]{1, 2}));
        assertEquals(0,PatternMatching.matchPattern(new int[]{1, 1, 1, 1, 2, 2, 3, 3},new int[]{1, 2}));
        assertEquals(0,PatternMatching.matchPattern(new int[]{1, 1, 10, 4, 4, 3},new int[]{1, 4, 3}));
    }
}