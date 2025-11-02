package Stack_Java;

import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3 };
        int[] arr2 = { 5, 6, 4 };
        List<Integer> ans = addTwoNumber(arr, arr2);
        System.out.println(ans);

    }

    public static List<Integer> addTwoNumber(int[] arr, int[] arr2) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            st2.push(arr2[i]);
        }
        int sum = 0;
        while (!st.isEmpty() || !st2.empty()) {
            if (!st.empty()) {
                sum += st.pop();
            }
            if (!st2.empty()) {
                sum += st2.pop();
            }

            if (sum > 9) {
                list.add(sum % 10);
                sum = sum / 10;
            } else {
                list.add(sum % 10);
                sum = 0;
            }
        }

        return list;
    }

}   
