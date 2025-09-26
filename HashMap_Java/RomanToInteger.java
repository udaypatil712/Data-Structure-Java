package HashMap_Java;



// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String str="IV";
        HashMap<String,Integer> map= new HashMap<>();
        map.put("I", 1);
        map.put("V", 5); 
        map.put("X", 10); 
        map.put("L", 50);
        map.put("C", 100); 
        map.put("D", 500);
        map.put("M", 1000);  

        System.out.println(map);
        int ans = 0;
        int prev = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            String ch = String.valueOf(str.charAt(i));
            int curr = map.get(ch);
            System.out.println(curr);
            if (curr < prev) {
                ans -= curr; // Subtract if smaller than previous
            } else {
                ans += curr;
            }
            prev = curr; // Update previous
        }
         System.out.println(ans);
     
        
    }
}
