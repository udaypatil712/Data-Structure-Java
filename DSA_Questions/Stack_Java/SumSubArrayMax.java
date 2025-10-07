package Stack_Java;

import java.util.*;;

public class SumSubArrayMax {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        System.out.println(maxSum(arr));
    }

    public static int maxSum(int[] arr) {  // this is little bit similar like next greater element 
        int[] right = NGE(arr);
        int[] left = PGE(arr);
        int sum = 0;
        long mod = (long)1e9 + 7;

        for(int  i =0 ;i<arr.length ;i++){
            int rightel = right[i] - i;
            int leftel = i - left[i];
            sum+=((long) arr[i] * rightel * leftel) % mod;
        }
        return (int) sum;
    }

    public static int[] NGE(int[] arr) {
        int[] right = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] <= arr[i]) { // this condition is same arr[top] <= arr[i]
                st.pop();
            }
            right[i] = st.empty() ? arr.length : st.peek();
            st.push(i);
        }
        return right;

    }

    public static int[] PGE(int[] arr) {
        int[] left = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] < arr[i]) { //this condition is same arr[top] < arr[i]
                st.pop();
            }
            left[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        return left;
    }
}
