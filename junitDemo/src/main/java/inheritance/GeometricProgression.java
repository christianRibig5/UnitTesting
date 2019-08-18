package inheritance;

public class GeometricProgression extends Progression{
    protected long base;

    /** Constructs progression 1, 2, 4, 8, 16, ... */
    public GeometricProgression(){
        this(2,1);      // start at 1 with base of 2
    }


    public GeometricProgression(long b){
        this(b,1);                  // start at 1 with arbitrary base
    }


    public GeometricProgression(long b,long start){
        super(start);
        base=b;
    }

    @Override
    protected void advance(){
        current*=base;
    }

}
