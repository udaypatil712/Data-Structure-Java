package Arrays_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PriceDay {
    public static void main(String[] args) {
        int[] arr={1,2,4};
        int ans=profit(arr);
        System.out.println(ans);

    }
    public static int profit(int[] arr){
        int max=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                max=arr[j] - arr[i];
                a.add(max);
            }
        }
     
         Collections.sort(a);
          
        int p = 0;
        boolean found=false;
        for (int i = 0; i < a.size(); i++) {
            if (p <= a.get(i)) {
                p = i;
                found=true;  
            }
          
        }
        if (found) {
            return a.get(p);
        }else{
            return 0;
        }
     
    }
}
