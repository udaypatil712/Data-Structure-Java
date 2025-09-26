package Recursion_Java;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int[] arr={5,4,6,7,2};
        int[] ans=bubbleSort(arr, 0,0);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] bubbleSort(int[] arr , int i , int j){
        if(i== arr.length){
            return arr;
        }
        // for understanding write like this then after go to solved recursion 

        // for(int j = 0 ; j < arr.length-1-i;j++){
        //     if (arr[j] > arr[j+1]) {
        //         int temp = arr[j];
        //         arr[j] =arr[j+1];
        //         arr[j+1] = temp;
        //     }
        //     System.out.println(Arrays.toString(arr));
        // }
        
        if (j < arr.length-1-i) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
            return bubbleSort(arr, i, j+1);
        }
        else{
            return bubbleSort(arr, i+1, 0);
        }
    } 
}
