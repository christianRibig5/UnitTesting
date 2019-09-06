package profesional.test;

import java.util.*;
public class LargestPrimeFactor {
    public static int largestPrimeFactor(int n){
        if(n<=1)return 0;
        List<Integer>primeFactors=factorsOfN(n);
        int max=primeFactors.get(0);
        for(int i=0;i<primeFactors.size();i++){
            if(primeFactors.get(i)>max){
                max=primeFactors.get(i);
            }
        }
        return max;
    }

    private static List<Integer> factorsOfN(int n) {
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
        LargestPrimeFactor.largestPrimeFactor(10);
        LargestPrimeFactor.largestPrimeFactor(6936);
        LargestPrimeFactor.largestPrimeFactor(1);
    }

}
