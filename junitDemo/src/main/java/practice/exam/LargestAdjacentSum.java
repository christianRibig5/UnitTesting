package practice.exam;


import java.util.ArrayList;
import java.util.List;

/**
 You have  40 minutes to complete this test. Please indent your program so that it is easy for the
 grader to read.

 1. Write a function named largestAdjacentSum that iterates through an array computing the sum of
 adjacent elements and returning the largest such sum. You may assume that the array has at least 2
 elements.

 If you are writing in Java or C#, the function signature is
 int largestAdjacentSum(int[ ] a)

 If you are writing in C or C++, the function signature is
 int largestAdjacentSum(int a[ ], int len) where len is the number of elements in a
 **/

public class LargestAdjacentSum {

    public static int largestAdjacentSum(int[]a){
        if(a.length<2)throw new RuntimeException("The array must have at least two elements");

        List<Integer> sum= getAdjacentSum(a);

        int largestSum=sum.get(0);

        for(int i=0;i<sum.size();i++){

            if(sum.get(i)>largestSum){
                largestSum=sum.get(i);
            }
        }

        return largestSum;
    }

    private static List getAdjacentSum(int[] a) {
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<a.length-1;i++){
            b.add(a[i]+a[i+1]);
        }
        return b;
    }


}
