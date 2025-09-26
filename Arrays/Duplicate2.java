package Arrays_Java.Arrays;

import java.util.HashMap;

public class Duplicate2 {
    public static void main(String[] args) {
        int[] arr={95,95};
        int k=3;
        boolean ans=indexReturn(arr, k);
        System.out.println(ans);
        
    }
    public static boolean indexReturn(int[] arr, int k){

        HashMap<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(m.containsKey(arr[i])){
                int firstIndeax=m.get(arr[i]);
                if (i - firstIndeax <= k) {
                    return true;
                }
            }
            m.put(arr[i], i);
        }
        return false;
 

        // for(int i=0;i<arr.length;i++){
        //     for(int j=1;j<arr.length;j++){
        //         if(arr[i] == arr[j] && k >= (j-i)){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
