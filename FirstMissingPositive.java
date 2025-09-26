package Arrays_Java;

import java.util.HashMap;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr={2,1};
        
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store all positive numbers in the map
        for (int num : arr) {
            if (num > 0) {
                map.put(num, 1);
            }
            System.out.println(num);
        }

        // Find the first positive number missing starting from 1
        for (int i = 1; i <= arr.length + 1; i++) {
            if (!map.containsKey(i)) {
                System.out.println(i);
            }
        }

        // Should never reach here
         System.out.println("-1");
       
        
    }
}
