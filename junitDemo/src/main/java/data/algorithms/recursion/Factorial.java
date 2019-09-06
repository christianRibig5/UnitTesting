package data.algorithms.recursion;

public class Factorial {
    public static double factorial(int n)throws IllegalArgumentException{
        double factorial=1;
        if(n<0){
            throw new IllegalArgumentException("Invalid input");
        }else if(n==0){
            return factorial;
        }else{
            factorial=n*factorial(n-1);
        }

        return factorial;
    }
    public static void main(String[]arg){
        System.out.println(Factorial.factorial(5));
    }
}
