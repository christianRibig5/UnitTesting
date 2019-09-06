package profesional.test;

import java.util.*;
public class CubePowered {
    public static int isCubePowered(int n){
        int result=1;
        int sum =0;
        List<Integer> a= generatedDigits(n);
        for(int i= 0; i<a.size();i++){
           sum+=Math.pow(a.get(i),3);
        }
        if(sum!=n | n<1)result = 0;
        return result;
    }

    private static List generatedDigits(int n) {
        List<Integer>b= new ArrayList<>();
        int digit=0;
        while(n>0){
            digit=n%10;
            b.add(digit);
            n=n/10;
        }

        return b;
    }
    public static void main(String[]arg){
        //TEST DATA
        CubePowered.isCubePowered(153);
        CubePowered.isCubePowered(370);
        CubePowered.isCubePowered(371);
        CubePowered.isCubePowered(407);
        CubePowered.isCubePowered(87);
        CubePowered.isCubePowered(0);
        CubePowered.isCubePowered(-81);

    }
}
