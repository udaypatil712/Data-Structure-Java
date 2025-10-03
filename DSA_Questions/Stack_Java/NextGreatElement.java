package Stack_Java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class NextGreatElement { // next greater element
    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4,6};
        int[] ans = optimalSolution(arr);
        System.out.println(Arrays.toString(ans));

        // int[] arr = { 2, 5, 9, 3, 1, 12, 6, 8, 7 };
        // int[] ans = optimalSolution(arr);
        // System.out.println(Arrays.toString(ans));
    }

    public static int[] bruteForce(int[] arr, int[] arr1) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int index = -1;

            for (int j = 0; j < arr1.length; j++) {
                if (num == arr[j]) {
                    index = j;
                    break;
                }
            }

            int maxEl = -1;
            for (int k = index + 1; k < arr1.length; k++) {
                if (arr1[k] > num) {
                    maxEl = arr1[k];
                    break;
                }
            }
            ans[i] = maxEl;
        }
        return ans;
    }

    public static int[] optimalSolution(int[] arr) {  // O(2N) , O(N) + O(N)
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
            System.out.println(st);
        }
        return ans;
    }
}
