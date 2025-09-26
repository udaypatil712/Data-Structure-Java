package Arrays_Java.Arrays;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] rev = new int[arr.length];
        int[] ans =reverseArray(arr, rev);
        System.out.println(Arrays.toString(ans));
 
    }

    public static int[] reverseArray(int[] arr, int[] rev) {
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }
        return rev;
    }
}
