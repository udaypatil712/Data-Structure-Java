package Arrays_Java.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 4, 9 };
        int ans = findMax(arr);
        System.out.println(ans);
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = i;
            }
        }
        return arr[max];
    }

}
