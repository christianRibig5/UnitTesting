package data.structure;

import org.junit.Test;

import java.util.Arrays;

public class RandomArrayDataGenerationTest {

    @Test
    public void randomizeArray() {
        RandomArrayDataGeneration randomGeneration= new RandomArrayDataGeneration();
        int []data=randomGeneration.randomizeArray(10);
        int[]originalArray= Arrays.copyOf(data,data.length);
        System.out.println("Array before sort is :"+Arrays.equals(originalArray,data));
        Arrays.sort(data);
        int[]sortedArray=data;
        System.out.println("Array after sort is :"+Arrays.equals(originalArray,sortedArray));
        System.out.println("Original Array is :"+Arrays.toString(originalArray));
        System.out.println("Sorted array is :"+Arrays.toString(sortedArray));
    }
}