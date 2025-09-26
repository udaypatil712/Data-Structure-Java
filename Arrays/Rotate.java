package Arrays_Java;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = arrayRotate(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] arrayRotate(int[] arr) {
        // int temp = arr[0];

        // for (int i = 1; i < arr.length; i++){
        //     arr[i - 1] = arr[i];
        // }
        // arr[arr.length - 1] = temp;

        int temp=arr[arr.length-1];
        
        for(int i=1;i<arr.length-1;i++){
            arr[i]=arr[i-1];
        }
        return arr;
    }

}
