package inheritance;

import java.util.List;

public class FibonacciProgression extends Progression {
    protected long prev;

    /** Constructs traditional Fibonacci, starting 0, 1, 1, 2, 3, ... */
    public FibonacciProgression(){
        this(0,1);
    }

    /** Constructs generalized Fibonacci, with give first and second values. */
    public FibonacciProgression(long first,long second){
        super(first);
        prev= second-first;                 // fictitious value preceding the first
    }

    protected void advance(){
        long temp = prev;
        prev=current;
        current+=temp;
    }
    public boolean isFibonacciProgressive(int[]a){
        for(int i=0;i<a.length-2;i++){
          if(!((a[i+2]-a[i+1])==a[i]))return false;
        }
        return true;
    }

    public static void main(String[]arg){
        System.out.println(new FibonacciProgression().isFibonacciProgressive(new int[]{0,1,1,2,3,5,8}));
        System.out.println(new FibonacciProgression(2,3).nextValue());
    }

}
