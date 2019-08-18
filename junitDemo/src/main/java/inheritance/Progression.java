package inheritance;

import java.util.ArrayList;
import java.util.List;

public class  Progression {
    protected long current;

    public Progression(){
        this(0);
    }
    public Progression(long start){
        current=start;
    }

    //returns the next value of the progression
    public long nextValue(){
       long answer= current;
       advance();
       return answer;
    }

    //advances the progression

    protected void advance(){
        current++;
    }


    //generate the progressive numbers and store in a list
    public  List progressiveList(int n){

        List<Long>numberList = new ArrayList<>();
        numberList.add(nextValue());

        for(int j=1;j<n;j++){
            numberList.add(nextValue());
        }
        return  numberList;
    }

    public boolean isProgressive(List<Long> list){
        for(int i=0;i<list.size()-1;i++){
            if(!(list.get(i)<list.get(i+1))) return false;
        }
        return true;
    }

}
