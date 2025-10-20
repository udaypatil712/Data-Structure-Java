package Stack_Java;

import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = { 10,2,-5 };
        int[] ans = asteroidCollision(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] asteroidCollision(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] < 0) {  // first check here element is negative go inside 
                int num = Math.abs(arr[i]);    // mod of that neagtive element
                // int top = list.get(list.size() - 1);  // get top element 
                while (!list.isEmpty() && list.get(list.size() - 1) > 0 && list.get(list.size() - 1) < num) {  // (not emtpy && 10 > 0 && 10 < 12) condition is true pop the element
                    list.remove(list.size() - 1); //pop the 10 here 
                }
                if (!list.isEmpty() && list.get(list.size() - 1) == num) {  // (not empty && 10 == -10(your absulute value) ) codition is true pop the element
                    list.remove(list.size() - 1); // pop the 10 here 
                } else if (list.isEmpty() || list.get(list.size() - 1) < 0) { // (is empty) =>first element (-12) push the element OR (-12 < 0 ) 
                    list.add(arr[i]); // -12 , -23
                }
            } else {
                list.add(arr[i]);
            }

        }
        int[] ans = new int[list.size()];
        int k =0;
        for(int i : list){
            ans[k]=i;
            k++;
        }
        return ans;

    }
}
