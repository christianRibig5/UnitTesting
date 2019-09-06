package profesional.test;



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
    public static void main(String[]arg){
        //TEST DATA
        Largest.largest(new int[]{7,9,8});
        Largest.largest(new int[]{8,7,8});
        Largest.largest(new int[]{-7,-4,-8});
        Largest.largest(new int[]{});
        Largest.largest(new int[]{1,1});
        Largest.largest(new int[]{-9,-8,-7});
    }

}
