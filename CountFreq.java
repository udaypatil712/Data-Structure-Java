package Arrays_Java;

import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    public static void main(String[] args) {
        int[] arr = { 1, 20, 1, 20, 3, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
         
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " comes " + entry.getValue() + " times");
        }

    }
}
