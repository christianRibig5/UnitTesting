package samples;



public class Largest {

    public static int largest(int[] list){
        if(list.length==0) return 0;
        int max=list[0];
        for(int i=0;i<list.length;i++){
            if(list[i]>max) {
                max = list[i];
            }
        }
        return max;
    }

}
