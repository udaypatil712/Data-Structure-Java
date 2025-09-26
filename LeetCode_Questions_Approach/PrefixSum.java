package LeetCode_Questions_Approach;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];

        }
        System.out.println(Arrays.toString(arr));
    }
}
