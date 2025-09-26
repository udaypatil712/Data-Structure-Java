package Arrays_Java;

import java.util.ArrayList;

public class MaxConsecutive {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count); // update max when count increases
            } else {
                count = 0; // reset count when 0 is found
            }
        }

        System.out.println("Maximum consecutive 1s: " + max);

        
       
    }
}
