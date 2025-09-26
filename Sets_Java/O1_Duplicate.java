package Sets_Java;

import java.util.Arrays;
import java.util.HashSet;

public class O1_Duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        HashSet<Integer> s=new HashSet<>();
       
        for(int num : arr){
             s.add(num);
        }
        for(int i=0;i<arr.length;i++){
             if (s.contains(arr[i])) {
                System.out.println(arr[i]);
          }
        }
       
        System.out.println(s);
        // int[] a=new int[s.size()];
        // int j=0;
        // for(int ans : s){
        //     a[j]=ans;
        //     j++;
        // }
        // System.out.println(Arrays.toString(a));
    }
}
