package Arrays_Java;

import java.util.Arrays;

public class ElementPut {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int index=0;
        int element=10;
        int[] a=new int[arr.length +1];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(i==index){
                a[i]=element;  
            }else{
                a[i]=arr[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
