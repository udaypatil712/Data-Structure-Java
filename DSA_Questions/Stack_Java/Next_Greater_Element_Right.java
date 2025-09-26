package Stack_Java;

import java.util.ArrayList;
import java.util.Stack;

public class Next_Greater_Element_Right {
    public static void main(String[] args) {
        int[] arr={2,5,9,3,1,12,6,8,7};   //5 9 12 12 12 -1  
        NextGreaterElementToRight(arr);
    }
    public static void NextGreaterElementToRight(int[] arr){
        ArrayList<Integer> st =new ArrayList<>();

        for(int i=1;i<arr.length;i++){
          if (arr[i-1] < arr[i] && i < arr.length-1) {
            st.add(arr[i]);
           }else{
            int j=i+1;
            if (arr[i] > arr[j]) {
                j++;
                if (arr[i] < arr[j]) {
                i=j;
                st.add(arr[j]);
                }
            } else{
                st.add(-1);
            }
          }
          st.add(arr[arr.length-1]);
        }

        
    }
}
