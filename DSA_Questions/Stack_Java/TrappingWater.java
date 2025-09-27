package Stack_Java;

public class TrappingWater {

    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };
        int ans = optimalSolution(arr);
        System.out.println(ans);
    }

    public static int optimalSolution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;

        while (left <= right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    ans += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    ans += rightMax - arr[right];
                }
                right--;
            }
        }

        return ans;
    }
}