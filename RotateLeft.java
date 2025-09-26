package Arrays_Java;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 8;
        int[] ans=leftShiftRotate(arr, d);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] leftShiftRotate(int[] arr , int d) {
        int n = arr.length;
        d = d % n;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        return arr;
    }
}
