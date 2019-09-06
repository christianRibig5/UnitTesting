package profesional.test;

public class DecodeArray {
    public static int decodeArray(int[]a){
        int result=0;
        if(a[0]<0){
            result=-1*Integer.valueOf(encode(a));
        }else{
           result =Integer.valueOf(encode(a));
        }

        return result;
    }

    private static String encode(int[] a) {
       StringBuilder sb= new StringBuilder();
        for(int i=0; i<a.length-1;i++){
            sb.append(Math.abs(a[i]-a[i+1]));
        }
       return sb.toString();
    }
    public static void main(String[]arg){
        //TEST
        DecodeArray.decodeArray(new int[]{0, -3, 0, -4, 0});
        DecodeArray.decodeArray(new int[]{-1, 5, 8, 17, 15});
        DecodeArray.decodeArray(new int[]{1, 5, 8, 17, 15});
        DecodeArray.decodeArray(new int[]{111, 115, 118, 127, 125});
        DecodeArray.decodeArray(new int[]{1, 1});

    }
}
