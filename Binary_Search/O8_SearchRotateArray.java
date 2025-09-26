package Binary_Search;

public class O8_SearchRotateArray {
    public static void main(String[] args) {
        int[] arr = {7,8,9,1,2,3};
        int target = 2;
        int ans =search(arr, target);
        System.out.println(ans);
    
    }

    public static int search(int[] arr, int target) {
        int pivot = PivotIndex(arr);

        if (pivot == -1) {
            return Binary_Search(arr, target,0, arr.length-1);
        }else if (arr[pivot] == target) {
            return pivot;
        }else if (arr[0] >= target) {  
            return Binary_Search(arr, target,pivot+1,arr.length-1);
        }else{
            return Binary_Search(arr, target,  0, pivot);
        }
    }

    public static int Binary_Search(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static int PivotIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            // case 1
            if (e > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case 2
            else if (s < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case 3
            else if (arr[0] >= arr[mid]) {
                e = mid - 1;
            } else if (arr[0] <= arr[mid]) {
                s = mid + 1;
            }
        }
        return -1;

    }
}
