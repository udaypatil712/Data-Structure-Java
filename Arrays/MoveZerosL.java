package Arrays_Java;

import java.util.Arrays;

public class MoveZerosL {
    public static void main(String[] args) {
        int[] arr={0,1,20,0,3};
        // int[] a=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
          
        }
        
        for(int i=j;i<arr.length;i++){
                arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));










         
        
    }
}
