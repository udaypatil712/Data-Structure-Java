package Arrays_Java.Arrays;
public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,9};
        int n = arr.length;
        int sum = 0;
        int sum1 = 0;
        int missing = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        sum1=n*(n+1)/2;
        missing=sum1-sum;



        // System.out.println(sum);
        // for (int i = 0; i < n + 1; i++) {
        //     sum1 = sum1 + i;
        // }
        // System.out.println(sum1);
        // missing = sum1 - sum;
        System.out.println(missing);
    }
}
