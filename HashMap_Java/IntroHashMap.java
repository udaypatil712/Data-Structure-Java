package HashMap_Java;

import java.util.HashMap;

public class IntroHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1, 2);
        map.put(2, 5);

        System.out.println(map.get(1));

        // for(Integer i : map.keySet()){
        //     System.out.println(map.get(i));
        // }   
    }
}
