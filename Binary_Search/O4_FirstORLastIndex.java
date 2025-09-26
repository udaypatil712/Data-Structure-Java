package Binary_Search;

import java.util.Arrays;

public class O4_FirstORLastIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 5, 7 };
        int target = 2;
        int[] ans=FirstAndLastIndex(arr,target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] FirstAndLastIndex(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0]=search(arr, target, true);
        ans[1]=search(arr, target, false);
        return ans;

    }

    public static int search(int[] arr, int target, boolean isfound) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) {
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                ans = mid;
                if (isfound) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }

}
