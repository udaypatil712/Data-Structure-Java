package Stack_Java;

import java.util.*;

public class PreviousSmallElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10, 8 };
        int[] ans = optimalSolution(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] optimalSolution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}
