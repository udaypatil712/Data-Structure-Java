 package Arrays;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int[] arr = { 4,9,5};
        int[] arr1 = { 2, 2 };
        int[] ans = InterSectionTwoArray(arr, arr1);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] InterSectionTwoArray(int[] arr, int[] arr1) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr) {
            set1.add(num);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for (int num1 : arr1) {
            if (set1.contains(num1)) {
                set2.add(num1);
            }
        }
        int[] ans = new int[set2.size()];
        int j = 0;
        for (int i : set2) {
            ans[j] = i;
            j++;
        }
        return ans;

        // for(int num : arr1){
        // set2.add(num);
        // }
        // set1.retainAll(set2);
        // System.out.println(set1);

    }
}
