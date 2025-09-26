package Recursion_Java;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 3, 11, 1 };
       
        System.out.println(Arrays.toString(sort(arr, 0, arr.length - 1)));

    }
    // Time complexity O(n * log n)
    // space complexity O(log n) (but taken by stack memory space)

    public static int[] sort(int[] arr, int low, int high) {
        if (low >= high) {
            return arr;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
          sort(arr, low, e);
          sort(arr, s, high);

        return arr;
    }

}
