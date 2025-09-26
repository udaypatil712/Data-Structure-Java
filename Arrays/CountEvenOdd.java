package Arrays_Java;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        count(arr);
    }

    public static void count(int[] arr) {
        int count = 0;
        int count1 =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                count++;
            }
            else{
                count1++;
            }
        }
        System.out.println("Even "+count);
        System.out.println("Odd "+count1);
    }
}
