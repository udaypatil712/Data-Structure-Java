package Recursion_Java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr={5,4,1,2,3};
        insertion(arr,0);
        // System.out.println(Arrays.toString(arr));

    }
    public static int[] insertion(int[] arr ,int i){
        if (i == arr.length-1) {
            return arr;
        }
        // for(int j=i+1;j>0;j--){
            // if (arr[j] < arr[j-1]) {
            //     int temp = arr[j];
            //     arr[j] = arr[j-1];
            //     arr[j-1]=temp;
            // }else{
            //     break;
            // }
        //     System.out.println(Arrays.toString(arr));
        // }
        
       
        return insertion(arr, i+1);
    }
    
}