package Arrays_Java.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };

        int ans[] = duplicateElement(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] duplicateElement(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.size(); j++) {
                if (arr[i] == a.get(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                a.add(arr[i]);

            }
        }
        int[] result = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            result[i] = a.get(i);
        }

        return result;
    }
}
