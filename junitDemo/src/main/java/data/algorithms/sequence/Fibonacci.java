package data.algorithms.sequence;

import java.util.*;
public class Fibonacci{
    private static  long current;
    private static long prev;
    public static long[] nTermFibonacci(int n, long first, long second){
        current=first;
        prev=second-first;
        long[]a=new long[n];
        for(int i=1;i<n;i++){
            a[i]=getFib();
        }
        long b[]= Arrays.copyOfRange(a,1,a.length);
      return b;
    }

    private static void nextFibonacci(){
        long temp=prev;
        prev=current;
        current+=temp;
    }
    private static long getFib(){
        long answer=current;
        nextFibonacci();
        return answer;
    }


    public static void main(String[]arg){
        System.out.println(Arrays.toString(Fibonacci.nTermFibonacci(5,0,1)));
    }

}
