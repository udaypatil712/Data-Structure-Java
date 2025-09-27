package Stack_Java;

import java.util.*;

public class NextGreatElement2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int[] ans =  optimalSolution(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] optimalSolution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        int n = arr.length;
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= arr[i % n]) {
                st.pop();
            }
            if (i < n) {
                ans[i] = st.empty() ? -1 : st.peek();
            }
            st.push(arr[i % n]);
        }
        return ans;

    }
}
