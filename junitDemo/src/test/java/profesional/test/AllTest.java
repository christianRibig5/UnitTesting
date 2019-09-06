package profesional.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({LargestAdjacentSumTest.class,ConcatenatedSumTest.class,
        CubePoweredTest.class,DecodeArrayTest.class,LargestPrimeFactorTest.class,
        LargestTest.class,PatternMatchingTest.class, SequencedArrayTest.class})
public class AllTest { }
