package inheritance;


import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class ProgressionTest {

    private List numberList1,numberList2,numberList3;

    @Before
    public void before(){
        numberList1 =new Progression().progressiveList(5);
        numberList2=new Progression(1).progressiveList(10);
        numberList3 =new ArrayList<Long>();
        numberList3.add(2L);
        numberList3.add(4L);
        numberList3.add(0L);

    }
    @Test
    public void progressiveListTest(){
        assertEquals(numberList1,new Progression().progressiveList(5));
        assertEquals(numberList2,new Progression(1).progressiveList(10));
    }
    @Test
    public void isProgressiveTest(){
        assertEquals(true,new Progression().isProgressive(numberList1));
        assertEquals(true,new Progression(1).isProgressive(numberList2));
        assertEquals(false,new Progression().isProgressive(numberList3));
    }



}