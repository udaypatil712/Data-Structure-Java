package Arrays_Java;

import java.util.Arrays;

public class Rotate1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = rotateArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] rotateArray(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (i == 1) {
                temp=arr[1];
                arr[1]=arr[n-1];
                arr[n-1]=temp;
                break;
            } else {
                arr[i] = arr[i];
            }
        }
        return arr;
    }
}
