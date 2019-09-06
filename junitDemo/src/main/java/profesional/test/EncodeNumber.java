package profesional.test;

import java.util.*;
public class EncodeNumber {
    public static int[]encodeNumber(int n){
        List<Integer>primeFactors=generatedPrimes(n);
        int[]answer=new int[primeFactors.size()];
        if(n<=1 | n<0)answer=null;
        for(int i=0; i<primeFactors.size();i++){
               answer[i]=primeFactors.get(i);
        }

        return answer;
    }

    private static List<Integer> generatedPrimes(int n) {
        List<Integer>nFactors= new ArrayList<>();
        for(int i=2;i<=n;i++){
            while (n % i == 0) {
                nFactors.add(i);
                n /= i;
            }
        }

        return nFactors;
    }
    public static void main(String[]arg){
        //TEST DATA
        EncodeNumber.encodeNumber(2);
        EncodeNumber.encodeNumber(6);
        EncodeNumber.encodeNumber(14);
        EncodeNumber.encodeNumber(1200);
        EncodeNumber.encodeNumber(1);
        EncodeNumber.encodeNumber(-18);
    }
}
