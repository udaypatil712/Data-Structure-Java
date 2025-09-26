package HashMap_Java;

import java.util.HashMap;
import java.util.Map;
 

public class FraequencyOfChar {
    public static void main(String[] args) {
        String str="stole now noch";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i='a';i<='z';i++){
           map.put(i,0);
        }
         System.out.println(map);

        for(int i=str.length()-1;i>=0;i--){
            char ch =str.charAt(i); 
            System.out.println(ch);
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch) +1);
            }
        }
        for(Map.Entry<Character, Integer> es : map.entrySet()){
            System.out.print(es.getValue()+" ");
        }
    }
}
