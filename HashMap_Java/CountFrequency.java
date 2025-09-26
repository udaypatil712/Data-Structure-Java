package HashMap_Java;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,6,5,2,7,4,3};
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
                count++;
                // count=count+arr[i];
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
            // System.out.println(entries.getKey() + " => " + entries.getValue());

            if(1<=entries.getValue()){
                System.out.print(entries.getKey());
            }
            // if (entries.getValue() == 2) {
            //     sum = sum + entries.getValue();
            // }

        }
        System.out.println(sum);
        // System.out.println(count);

    }
}
