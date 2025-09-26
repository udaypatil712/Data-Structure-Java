package HashMap_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={2,1,1,1,2,2};
        int element=Majority(arr);
        System.out.println(element);

    }
    public static int Majority(int[] arr){
        int n=arr.length;
        int element=0;
        HashMap<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if (m.containsKey(arr[i])) {
                m.put(arr[i],m.get(arr[i]) +1);
            }else{
                m.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> es : m.entrySet()){
            if(es.getValue() > (n/2)){
                element=es.getKey();
            }
            else{   
                return -1;
            }
        }
        return element;

    }
}
