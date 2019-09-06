package samples;

import java.util.*;
public class Foo {
    public static void main(String[]arg){
        int [] array= new int[4];

        LinkedList<Integer>list2=new LinkedList<>();
        list2.addFirst(1);

        List<Integer>list1= new ArrayList<>();
        list1.add(1);

        array=new int[]{1,3,4,8,2};
        int[]b=array.clone();
        System.out.println(Arrays.toString(b));
    }
}
