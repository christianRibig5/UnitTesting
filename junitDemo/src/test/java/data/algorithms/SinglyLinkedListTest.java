package data.algorithms;

import data.structures.implementation.SinglyLinkedList;
import org.junit.Test;



public class SinglyLinkedListTest {
    @Test
    public void singlyLinkedListTest(){
        SinglyLinkedList<Integer> singlyLinkedList= new SinglyLinkedList<>();
        singlyLinkedList.addFirst(3);
        singlyLinkedList.addFirst(4);
            System.out.println(singlyLinkedList.last());

            int[] arr= new int[]{1,3,4,5};
            for(int i=0;i<arr.length;i++){
                singlyLinkedList.addLast(arr[i]);
            }
            System.out.println(singlyLinkedList);


    }

}