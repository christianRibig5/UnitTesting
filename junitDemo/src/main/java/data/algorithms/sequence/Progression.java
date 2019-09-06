package data.algorithms.sequence;

public class Progression {
    private long current;
    public Progression(){ this(0);}
    public Progression(long start){
        current=start;
    }
    protected void advance(){
        current++;
    }
    public long nextValue(){
        long answer=current;
        advance();
        return answer;
    }

}
