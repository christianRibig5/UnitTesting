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
    public boolean isFibonacciProgressive(List<Long> list){
        for(int i=0;i<list.size()-1;i++){

        }
        return true;
    }

}
