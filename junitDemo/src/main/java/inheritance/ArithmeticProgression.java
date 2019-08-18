package inheritance;

public class ArithmeticProgression extends Progression {
    protected long increment;


    /** Constructs progression 0, 1, 2, ... */
    public ArithmeticProgression(){         // start at 0 with increment of 1
        this(1,0);
    }

    public ArithmeticProgression(long stepSize){       // start at 0
        this(stepSize,0);
    }


    /** Constructs arithmetic progression with arbitrary start and increment. */
    public ArithmeticProgression(long stepSize,long start){
        super(start);
        increment=stepSize;
    }


    /** Adds the arithmetic increment to the current value. */
    @Override
    public void advance(){
        current+=increment;
    }

}
