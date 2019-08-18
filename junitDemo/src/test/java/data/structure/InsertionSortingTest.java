package data.structure;

import org.junit.Test;

import static org.junit.Assert.*;


public class InsertionSortingTest {

    private InsertionSorting insertionSorting = new InsertionSorting();

    @Test
    public void insertionSort() {
        char[] a= new char[]{'E','C','F','B','A'};
        char[]b= new char[]{'A','B','C','E','F'};
        int[]val1=new int[]{2,5,6,0,1,9};
        int[]sortedVal1= new int[]{0,1,2,5,6,9};
        double[]dobV= new double[]{2.0,5.9,6.6,0.8,1.5,9.2};
        double[]sortedDobV= new double[]{0.8,1.5,2.0,5.9,6.6,9.2};
        assertArrayEquals(b, insertionSorting.sort(a));
        assertArrayEquals(sortedVal1, insertionSorting.sort(val1));
        assertArrayEquals(sortedDobV, insertionSorting.sort(dobV),0.01);

    }
}