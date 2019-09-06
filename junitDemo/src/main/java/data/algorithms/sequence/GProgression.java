package data.algorithms.sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GProgression {
    private static long current;
   private static long base;
    public static long[]geometricProgression(int n,long b, long start){
        base=b;
        current=start;
        long[]gp= new long[n];
        for(int i=1;i<n;i++){
            gp[i]=getGP();
        }
        long val[]= Arrays.copyOfRange(gp,1,gp.length);
        return val;
    }

    private static long getGP() {
        long answer=current;
        nextGP();
        return answer;
    }

    private static void nextGP() {
        current*=base;
    }
    public static void main(String[]arg){
        System.out.println(Arrays.toString(GProgression.geometricProgression(5,2,2)));

        List<Integer> a=new ArrayList<>();
        for(int j=2;j<20;j*=2){
            a.add(j);
        }
        System.out.println(a);
    }
}
