package Sets_Java;


import java.util.Arrays;
import java.util.HashSet;
 
import java.util.Set;

public class O2_IntersectionElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        int[] arr1 = { 2, 2 };
        int[] ans = CommonElement(arr, arr1);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] CommonElement(int[] arr, int[] arr1) {
        
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr) {
            set1.add(num);
        }
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        for (int num2 : arr1) {
            if (set1.contains(num2)) {
                set2.add(num2);
            }
        }
        System.out.println(set2);
        int[] res = new int[set2.size()];
        int i = 0;
        for (int ans : set2) {
            res[i] = ans;
            i++;

        }
        return res;
    }
}
