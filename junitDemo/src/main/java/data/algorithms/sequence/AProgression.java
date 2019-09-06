package data.algorithms.sequence;

import java.util.*;

public class AProgression {
    private  static long current;
    private static long increment;
    public static long[] arithmeticProgression(int n, long stepwise,long start){
        current=start;
        increment=stepwise;
        long[]ap=new long[n];
        for(int i=1;i<n; i++){
            ap[i]=getAP();
        }

        long val[]= Arrays.copyOfRange(ap,1,ap.length);
        return val;
    }

    private static long getAP() {
        long answer=current;
        nextAP();
        return answer;
    }

    private static void nextAP() {
        current+=increment;
    }
    public static void main(String[]arg){
        System.out.println(Arrays.toString(AProgression.arithmeticProgression(5,2,2)));
        List<Integer>a=new ArrayList<>();
        for(int j=2;j<10;j+=2){
            a.add(j);
        }
        System.out.println(a);
    }

}
