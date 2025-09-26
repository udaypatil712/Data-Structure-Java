package Recursion_Java;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5,1,1,2,0,0};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        // this will create new array without any change in our main Array
        // =>Arrays.copyOfRange(arr, START , END);
        int[] leftarr = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightarr = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArr(leftarr, rightarr);
    }

    public static int[] mergeArr(int[] leftarr, int[] rightarr) {
        int[] finalMergeArr = new int[leftarr.length + rightarr.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftarr.length && j < rightarr.length) {
            if (leftarr[i] < rightarr[j]) {
                finalMergeArr[k] = leftarr[i];
                i++;
            } else {
                finalMergeArr[k] = rightarr[j];
                j++;
            }
            k++;
        }
        while (i < leftarr.length) {
            finalMergeArr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < rightarr.length) {
            finalMergeArr[k] = rightarr[j];
            j++;
            k++;
        }

        return finalMergeArr;

    }

 
 
}
