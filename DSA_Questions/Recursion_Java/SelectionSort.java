package Recursion_Java;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8};
        int[] ans=selectionSort(arr, 0, 0);
        System.out.println(Arrays.toString(ans));
    }
    
    public static int[] selectionSort(int[] arr , int i ,int j){
        if(i == arr.length){
            return arr;
        }
        if (j < arr.length) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
            System.out.println(Arrays.toString(arr));
           return selectionSort(arr, i, j+1);
        }else{
            System.out.println("..............");
           return selectionSort(arr, i+1, i+1);
        }
    }

    public static int[]  selectionSort2(int[] arr) {
        
        for(int i = 0 ;i<arr.length;i++){
            int lastIndex=arr.length-1-i;
            int max=findMax(arr,0,lastIndex);
            swap(arr, max, lastIndex);
        } 
        return arr;  

    }

    public static void swap(int[] arr, int first , int end){
         int temp = arr[first];
         arr[first] = arr[end];
         arr[end] = temp;
    }

    public static int findMax(int[] arr , int start , int end){

        int max=start;

         for(int i =0 ;i<arr.length;i++){
            if (arr[max] < arr[i]) {
                max=i;
            }
         }
         return max;
    }
}
 