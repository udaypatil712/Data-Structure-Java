package Binary_Search;

public class O2_CelingOfNumber {
     public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 8 };
        int target = 6;
        int ans = celingNumber(arr, target);
        System.out.println(ans);

    }
    public static int celingNumber(int[] arr, int target) {
        int start = 0;
       int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start; // flore of Number then return e;
    }

}