package Arrays_Java.Arrays;

public class RotateTarget {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int ans = search(arr, target);
        System.out.println(ans);

    }
 
        // Second approach for this program..

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] >= arr[left]) {
                if (arr[left] <= target && target <= arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (arr[mid] <= target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;        
    }
}

        // First Approach 

    // public static int search(int[] arr, int target) {
    //     int pivot = findPivot(arr, target);

    //     if (arr[pivot] == target) {
    //         return pivot;
    //     } else if (arr[0] < target) {
    //         return binarySearch(arr, target, 0, pivot - 1);
    //     }
    //     return binarySearch(arr, target, pivot + 1, arr.length-1);
    // }

    // public static int binarySearch(int[] arr, int target, int start, int end) {

    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (arr[mid] == target) {
    //             return mid;
    //         } else if (arr[mid] > target) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static int findPivot(int[] arr, int target) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         // case1 {4 5 6 7 0 1 2} mid=7 > mid+1=0
    //         if (mid < end && arr[mid] > arr[mid + 1]) {
    //             return mid;
    //         }
    //         // case2 {6 7 0 1 2} mid=0 > mid-1=7
    //         else if (mid > end && arr[mid] < arr[mid - 1]) {
    //             return mid - 1;
    //         }
    //         // case3 {4 5 6 3 2 1 0} arr[mid]=3 <= arr[s]=4..
    //         else if (arr[mid] <= arr[0]) {
    //             end = mid - 1;
    //         }
    //         // case4 ->
    //         else {
    //             start = mid + 1;
    //         }
    //     }
    //     return -1;
    // }


