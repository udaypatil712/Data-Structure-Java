package Stack_Java;

import java.util.*;;

public class SumArrayOfMini {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };

        // System.out.println(bruteForceApproach(arr));
        System.out.println(minSum(arr));
    }

    public static int bruteForceApproach(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i; j < arr.length; j++) {
                int min = Math.min(temp, arr[j]);
                temp = min;
                // System.out.println("temp.. " + temp + " comapre with.. " + arr[j] + " min.. "
                // + min);
                sum = sum + min;
            }
        }
        return sum;
    }

    public static int minSum(int[] arr) {  // this is little similar previous smallest element
        int[] right = NGE(arr);
        int[] left = PSE(arr);
        int sum = 0;
    
        for (int i = 0; i < arr.length; i++) {
            int right1 = right[i] - i;
            int left1 =   i - left[i];              // use mod is minimize the answer that's why use mod
            sum += ((long) arr[i] * left1 * right1) % ((Math.pow(10, 9)) + 7 );  // for safe side you can use mod because of another test cases you need mod
        }
        return (int)sum;
    }

    // next greater element
    public static int[] NGE(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] right = new int[arr.length];
        int n = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.empty() && arr[st.peek()] >= arr[i]) {   // this condition arr[top] >= arr[i]
                st.pop();
            }
            right[i] = st.empty() ? n  : st.peek();
            st.push(i);
        }
        return right;
    }
 
    // previous smallest element
    public static int[] PSE(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] left = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!st.empty() && arr[st.peek()] > arr[i]) { // this condition arr[top] >= arr[i]
                st.pop();
            }
            left[i] = st.empty() ? -1 : st.peek();
            st.push(i);
        }
        return left;
    }
}
