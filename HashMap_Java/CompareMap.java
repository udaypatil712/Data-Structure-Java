package HashMap_Java;

import java.util.HashMap;
import java.util.Map;

public class CompareMap {
    public static void main(String[] args) {
        String[] arr={"a" , "b", "c" ,"d"};
        String[] a={"a" , "e", "q" ,"p"};
        System.out.println(arr[0]);

        HashMap<String,Integer> m=new HashMap<>();
        HashMap<String,Integer> n=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            m.put(arr[i], i);
        }
        System.out.println(m);
        for(int j=0;j<a.length;j++){
            n.put(a[j],j);
        }
        System.out.println(n);
        String mkey=null;
        int mvalue=0;
        String nkey=null;
        int nvalue=0;
        for(Map.Entry<String, Integer> es : m.entrySet()){
            mkey=es.getKey();
            mvalue=es.getValue();
            for(Map.Entry<String, Integer> e : n.entrySet()){
                nkey=e.getKey();
                nvalue=e.getValue();
                if (mkey.equals(nkey) && mvalue == nvalue) {
                    System.out.println(nkey);
                }
            
        }
              
        }
           
         

    }
}
