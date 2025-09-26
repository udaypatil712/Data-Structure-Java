package Arrays_Java;

import java.util.Arrays;

public class ExceptElement {
    public static void main(String[] args) {
        int[] arr ={4,3,2,10};
        elementSum(arr);
        // System.out.println(Arrays.toString(ans));
    }
 public static void elementSum(int[] arr){  

    //time and space complexity o(n*n) and o(n)
        // int[] a = new int[arr.length];
        // for(int i = 0; i < arr.length; i++) {
        //     int sum = 0;
        //     for(int j =0 ; j < arr.length; j++) {
        //         if(arr[i] != arr[j]) {
        //             sum += arr[j];   
        //         }
        //     }
        //     a[i] = sum;
        // }
        // System.out.println(Arrays.toString(a));


          //time and space complexity o(n) and o(1)
		 int sum=0;   
		 for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		 }
		 for(int i=0;i<arr.length;i++){
			arr[i]=sum-arr[i];
		 }
		 System.out.println(Arrays.toString(arr));
    }
}
