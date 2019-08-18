package data.structure;


import java.util.Random;

public class RandomArrayDataGeneration {

    public int[] randomizeArray(int length){
        int[]data= new int[length];
        Random random= new Random();
        random.setSeed(System.currentTimeMillis());
        for(int i=0;i<data.length;i++){
            data[i]=random.nextInt(100);
        }
        return data;
    }

}
