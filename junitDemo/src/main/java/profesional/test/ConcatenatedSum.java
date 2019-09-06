package profesional.test;

import java.util.List;
import java.util.ArrayList;
public class ConcatenatedSum {
    public static int checkConcatenatedSum(int n, int catLen) {
        int answer = 1;
        int sum =0;
        List<Integer>numbers=generatedNumbers(n,catLen);
        for(int i=0;i<numbers.size();i++){
           sum+=numbers.get(i);
        }
        if(sum!=n)answer=0;

        return answer;
    }

    private static List<Integer> generatedNumbers(int n, int catLen) {
        Double number = Double.parseDouble(finalString(n,catLen).toString());
        List<Integer>numberList=new ArrayList<>();
        if(number>Integer.MAX_VALUE){
            numberList =splitNumber(finalString(n,catLen),catLen);
        }else{
            double  multiDigit=0;
            while(number>1){
                multiDigit=number%(Math.pow(10,catLen));
                numberList.add((int)multiDigit);
                number=number/((long)Math.pow(10,catLen));
            }
        }

        return numberList;
    }

    private static List<Integer> splitNumber(StringBuilder sb, int splitLen) {
        List<Integer>integerList= new ArrayList<>();
        String subStr1=String.valueOf(sb).substring(0,splitLen);
        integerList.add(Integer.parseInt(subStr1));
        Long subStr2=Long.parseLong(String.valueOf(sb).substring(splitLen));
        double nSplit=0;
        while(subStr2>1){
            nSplit=subStr2%((int)Math.pow(10,splitLen));
            integerList.add((int)nSplit);
            subStr2=subStr2/((long)Math.pow(10,splitLen));
        }

        return integerList;
    }

    private static  StringBuilder finalString(int n , int catLen){
        StringBuilder catDigit= new StringBuilder();
        int nDigit = 0;
        while (n > 0) {
            nDigit = n % 10;
            for(int i=0;i<catLen;i++){
                catDigit.append(nDigit);
            }
            n = n / 10;
        }
        return catDigit;
    }
    public static void main(String[]arg){
        //TEST
        ConcatenatedSum.checkConcatenatedSum(198,2);
        ConcatenatedSum.checkConcatenatedSum(198,3);
        ConcatenatedSum.checkConcatenatedSum(2997,3);
        ConcatenatedSum.checkConcatenatedSum(2997,2);
        ConcatenatedSum.checkConcatenatedSum(13332,4);
        ConcatenatedSum.checkConcatenatedSum(9,1);
    }
}
