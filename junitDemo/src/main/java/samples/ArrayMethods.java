package samples;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMethods {

    public void arrays_equals(){
        System.out.println("********Arrays.equals() test***********");
        int[]arr1=new int[]{1,2,3,4};
        int[]arr2=new int[]{1,2,3,4};
        int[]arr3=new int[]{1,2,4,3};

        System.out.println("arr1 equal arr2: "+Arrays.equals(arr1,arr2));
        System.out.println("arr1 equal arr3: "+Arrays.equals(arr1,arr3));
    }

    public void arrays_fill(){
        System.out.println("********Arrays.fill() test***********");
        // initializing int array
        int arr[] = new int[] {1, 6, 3, 2, 9};

        // let us print the values
        System.out.println("Actual values: ");
        for (int value : arr) {
            System.out.print(value+",");
        }

        System.out.println();
        // using fill for placing 18
        Arrays.fill(arr, 18);

        // let us print the values
        System.out.println("New values after using fill() method: ");
        for (int value : arr) {
            System.out.print(value+", ");
        }

    }


    public void arrays_copy_of(){
        System.out.println("********Arrays.copyOf() test***********");
        // initializing an array arr1
        int[] arr1 = new int[] {45, 32, 75};

        // printing the array
        System.out.println("Printing 1st array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
        }

        // copying array arr1 to arr2 with newLength as 5
        int[] arr2 = Arrays.copyOf(arr1, 5);
        arr2[3] = 11;
        arr2[4] = 55;

        System.out.println();
        // printing the array arr2
        System.out.println("Printing new array:");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+", ");
        }


    }

    public void arrays_of_range(){

        System.out.println("********Arrays.copyOfRange() test***********");
        // initializing an array arr1
        short[] arr1 = new short[] {15, 10, 45};

        // printing the array
        System.out.println("Printing 1st array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
        }

        System.out.println();

        // copying array arr1 to arr2 with range of index from 1 to 3
        short[] arr2 = Arrays.copyOfRange(arr1, 1, 3);

        // printing the array arr2
        System.out.println("Printing new array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+", ");
        }
    }

    public void arrays_sort(){
        /** it is has overloaded constructor
         *  ...
         * Arrays.sort (int [])
         * Arrays.sort (String [])
         * Arrays.sort (float [])
         * Arrays.sort (double [])
         * Arrays.sort (long [])
         * Arrays.sort (Object [])
         * ...
         * **/

        System.out.println("********Arrays.sort() test***********");

        String [] stringArray = {"ab", "aB", "c", "0", "2", "1Ad", "a10"};

        System.out.println("Unsorted String Array");
        for (String str : stringArray) {
            System.out.print(str+", ");
        }

        Arrays.sort(stringArray);
        System.out.println();
        System.out.println("Sorted String Array");
        for (String str : stringArray) {
            System.out.print(str+", ");
        }
    }


    public void arrays_sort_in_reverese_order(){

        String [] stringArray = {"ab", "aB", "c", "0", "2", "1Ad", "a10"};

//        System.out.println("Unsorted String Array");
//        for (String str : stringArray) {
//            System.out.print(str+",");
//        }

        Arrays.sort(stringArray);

//        System.out.println("Sorted String Array");
//        for (String str : stringArray) {
//            System.out.print(str+", ");
//        }

        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println();
        System.out.println("Reverse Sorted String Array");
        for (String str : stringArray) {
            System.out.print(str+", ");
        }
    }
    public void arrays_selective_sort(){
        String [] stringArray = {"ab", "aB", "c", "0", "2", "1Ad", "a10"};

//        System.out.println("Unsorted String Array");
//        for (String str : stringArray) {
//            System.out.print(str+",");
//        }


        //Sorting array starting from index 3 till 6

        Arrays.sort(stringArray, 3, 6);

        System.out.println("Selective Sort String Array");
        for (String str : stringArray) {
            System.out.print(str+", ");
        }

    }

    public static void main(String[]arg){
        ArrayMethods arrayMethods = new ArrayMethods();

        arrayMethods.arrays_equals();
        System.out.println();
        arrayMethods.arrays_fill();
        System.out.println();
        arrayMethods.arrays_copy_of();
        System.out.println();
        arrayMethods.arrays_of_range();
        System.out.println();
        arrayMethods.arrays_sort();
        System.out.println();
        arrayMethods.arrays_sort_in_reverese_order();
        System.out.println();
        arrayMethods.arrays_selective_sort();
        System.out.println();
        System.out.println("The current time in milliseconds is :\n"+System.currentTimeMillis());

    }

}
