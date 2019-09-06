package profesional.test;

import java.util.*;


public class IntegerBasedRounding {
    public static void doIntegerBasedRounding(int[] a, int n) {
        int[] b =new int[a.length];
        if (n <= 0 ) {
            for (int i = 0; i < a.length; i++) {
                b[i]=a[i];
            }
            System.out.println(Arrays.toString(b));
        }
        else if(a.length>1){

            baseRound(a,n);
        }
        System.out.println(Arrays.toString(baseRound(a,n)));
    }

    private static int[] baseRound(int[] a, int n) {
        int[]roundedNumbers=new int[a.length];
        for(int i =0;i<a.length;i++){
            if(a[i]<0){
                roundedNumbers[i]=a[i];
            }else{
                roundedNumbers[i] =(int)(Math.round((double)(a[i])/n)*n);
            }

        }
        return roundedNumbers;
    }
    public static void main(String[]arg){
        //TEST DATA
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},2);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},3);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},-3);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{-1, -2, -3, -4, -5},3);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{-18, 1, 2, 3, 4, 5},4);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},5);
        IntegerBasedRounding.doIntegerBasedRounding(new int[]{1, 2, 3, 4, 5},100);
    }
}
