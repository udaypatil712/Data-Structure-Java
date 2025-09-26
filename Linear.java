package Arrays_Java;

public class Linear {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 12, 2 };
        int target = 5;
        int ans = findTarget(arr, target);
        System.out.println(ans);

    }

    public static int findTarget(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;

    }
}
