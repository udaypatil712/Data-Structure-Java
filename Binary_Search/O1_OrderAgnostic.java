package Binary_Search;

public class O1_OrderAgnostic {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5 };
        int target = 1;
        int ans =search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] > arr[mid]) {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
