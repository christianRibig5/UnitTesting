package profesional.test;

import org.junit.Test;

public class IntegerBasedRoundingTest {

    int a1[]={2, 2, 4, 4, 6};
    int a2[]={0, 3, 3, 3, 6};
    int a3[]={1, 2, 3, 4, 5};
    int a4[]={-1, -2, -3, -4, -5};
    int a5[]={-18, 0, 4, 4, 4, 4};
    int a6[]={0, 0, 5, 5, 5};
    int a7[]={0, 0, 0, 0, 0};

    @Test
    public void doIntegerBasedRounding() {

        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},2);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},3);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},-3);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5},3);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5},4);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},5);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},100);
    }
}