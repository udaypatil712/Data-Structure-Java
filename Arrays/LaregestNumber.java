package Arrays_Java.Arrays;

import java.util.Arrays;

public class LaregestNumber {
    public static void main(String[] args) {
        int[] arr={3,30,34,5,9};
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
           
        }
        System.out.println(Arrays.toString(arr));
    }
  
}
