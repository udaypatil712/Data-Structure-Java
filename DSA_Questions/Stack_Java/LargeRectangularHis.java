package Stack_Java;

import java.util.Stack;

public class LargeRectangularHis {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] arr) {
        int[] right =  NSE(arr);
        int[] left = PSE(arr);
        int max=0;

        for(int i =0;i<arr.length;i++){
            max = Math.max(max, (arr[i] * (right[i] - left[i] - 1)));
        }
        return max;

    }

    public static int[] NSE(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] right = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return right;
    }

    public static int[] PSE(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] left = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return left;
    }
}
