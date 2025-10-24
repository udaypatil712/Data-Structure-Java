package Practice_Questions;

import java.lang.reflect.Array;
import java.util.*;

public class SortingRevision {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        // int low = 0;
        // int high = arr.length - 1;
        // int[] ans = mergeSort(arr, low, high);
        // System.out.println(Arrays.toString(ans));

        // int[] ans = quickSort(arr, low, high);
        // System.out.println(Arrays.toString(ans));

        // int[] ans = insertionSort(arr);
        // System.out.println(Arrays.toString(ans));

        // int[] ans = selectionSort(arr);
        // System.out.println(Arrays.toString(ans));

        // int[] ans = bubblesSort(arr);
        // System.out.println(Arrays.toString(ans));
    
    }

    // Sorting Algorithms

    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            return new int[] { arr[low] };
        }
        int s = low;
        int e = high;

        int mid = (s + (e - s) / 2);

        int[] leftArr = mergeSort(arr, low, mid);
        int[] rightArr = mergeSort(arr, mid + 1, high);

        return sort(leftArr, rightArr);

    }

    public static int[] sort(int[] leftArr, int[] rightArr) {
        int[] mergeSortArr = new int[leftArr.length + rightArr.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                mergeSortArr[k] = leftArr[i];
                i++;
            } else {
                mergeSortArr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftArr.length) {
            mergeSortArr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightArr.length) {
            mergeSortArr[k] = rightArr[j];
            j++;
            k++;
        }

        return mergeSortArr;

    }

    public static int[] quickSort(int[] arr, int low, int high) {
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

        quickSort(arr, low, e);
        quickSort(arr, s, high);

        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
                System.out.println(Arrays.toString(arr));
            }

            System.out.println("........");
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }

            System.out.println("........");
        }
        return arr;
    }

    public static int[] bubblesSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("........");
        }
        return arr;
    }

}
