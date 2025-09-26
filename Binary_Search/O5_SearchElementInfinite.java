package Binary_Search;

public class O5_SearchElementInfinite {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44 };
        int target = 44;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target) {
        int s = 0;
        int e = 1;

        while (e < arr.length && target > arr[e]) {
            int temp = e + 1;
            e = temp*temp;
            s = temp;
            e = arr.length - 1;
        }

        // Cap `e` at last valid index
        // if (e >= arr.length) {
            
        // }

        return BinarySearch(arr, target, s, e);
    }

    public static int BinarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) {
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
