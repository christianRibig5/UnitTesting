package profesional.test;

public class SequencedArray {
    public static int isSequencedArray(int[]a, int m, int n){
        int answer=1;
        if(a[0]!=m || a[a.length-1]!=n)answer=0;
        for(int i=0;i<a.length-1;i++){
            if(!(a[i]<=a[i+1]) || (a[i+1]-a[i]>1))answer=0;
        }
        return answer;
    }
    public static void main(String[]arg){
        //TEST
        SequencedArray.isSequencedArray(new int[]{1, 2, 3, 4, 5},1,5);
        SequencedArray.isSequencedArray(new int[]{1, 3, 4, 2, 5},1,5);
        SequencedArray.isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2},-5,-2);
        SequencedArray.isSequencedArray(new int[]{0, 1, 2, 3, 4, 5},1,5);
        SequencedArray.isSequencedArray(new int[]{1, 2, 3, 4},1,5);
        SequencedArray.isSequencedArray(new int[]{1, 2, 5},1,5);
        SequencedArray.isSequencedArray(new int[]{5, 4, 3, 2, 1},1,5);
    }
}
