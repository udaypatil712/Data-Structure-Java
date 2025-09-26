package HashMap_Java;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 ,5};
        int ans = findElement(arr);
        System.out.println(ans);
    }

    public static int findElement(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entries : m.entrySet()) {
            if (entries.getValue() == 1) {
                element = entries.getKey();
            }
        }
        return element;
    }
}
