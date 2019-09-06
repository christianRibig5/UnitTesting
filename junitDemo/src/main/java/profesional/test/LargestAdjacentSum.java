package profesional.test;


import java.util.ArrayList;
import java.util.List;


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
    public static void main(String[]arg){
        LargestAdjacentSum.largestAdjacentSum(new int[]{1, 2, 3, 4});
        LargestAdjacentSum.largestAdjacentSum(new int[]{18, -12, 9, -10});
        LargestAdjacentSum.largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1});
        LargestAdjacentSum.largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1});
    }


}
