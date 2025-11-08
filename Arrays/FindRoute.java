package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class FindRoute {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 0 },
                        { 1, 1, 0, 1, 0 }, 
                        { 0, 0, 0, 1, 1 }, 
                        { 0, 1, 0, 0, 0 } };

                        
        int[][] ans = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };

        System.out.println(Arrays.deepToString(findRoute(arr, ans)));
    }

    public static int[][] findRoute(int[][] arr, int[][] ans) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    i++;
                }
                for (int k = 0; k <= j; k++) {
                    if (arr[i][k] == 0) {
                        ans[i][k] = 1;
                    }
                }
            }
        }
        return ans;
    }
}
