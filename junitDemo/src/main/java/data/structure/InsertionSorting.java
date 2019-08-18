package data.structure;

public class InsertionSorting {
    public char[] sort(char[]a){
        for(int i=1;i<a.length;i++){
            char cur=a[i];    // start from first value where i=1 not 0

            int k=i;

            while(k>0 && a[k-1]>cur){
                a[k]=a[k-1];
                k--;
            }
            a[k]=cur;

        }
        return a;
    }

    public int[]sort(int[]a){
        for(int i=1;i<a.length;i++){
            int cur=a[i];    // start from first value where i=1 not 0

            int k=i;

            while(k>0 && a[k-1]>cur){
                a[k]=a[k-1];
                k--;
            }
            a[k]=cur;

        }
        return a;

    }
    public double[]sort(double[]a){
        for(int i=1;i<a.length;i++){
            double cur=a[i];    // start from first value where i=1 not 0

            int k=i;

            while(k>0 && a[k-1]>cur){
                a[k]=a[k-1];
                k--;
            }
            a[k]=cur;

        }
        return a;
    }


}
