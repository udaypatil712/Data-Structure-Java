package Arrays_Java;

public class SecondLarget {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 9, 3, 9, 7 };
        int ans = findSec(arr);
        System.out.println(ans);
    }

    public static int findSec(int[] arr) {
        int larget = arr[0];
        int slarget = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > larget) {
                slarget = larget;
                larget = arr[i];
            } else if (arr[i] < larget && arr[i] > slarget) {
                slarget = arr[i];
            }
        }
        return slarget;
    }
}
