package Arrays_Java;

 

public class CheckSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0 };
        boolean ans = arraySort(arr);
        System.out.println(ans);
    }

    public static boolean arraySort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println(arr[i]);
                return false;
            }

        }
        return true;

    }

}