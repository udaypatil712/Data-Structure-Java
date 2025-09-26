package Arrays_Java;



public class QuickSort {
    public static void main(String[] args) {
       int[] arr = {4, 5, 3, 7, 2};
        int[] ans = new int[arr.length];

        int s = 0;
        int e = arr.length - 1;
        int p = s + (e - s) / 2;

        int pivot = arr[p];
        ans[0] = pivot;

        int index = 1;  // Start filling from index 1
        for (int i = 0; i < arr.length; i++) {
            if (i != p) {  // Skip the pivot index
                ans[index++] = arr[i];
            }
        }

        // Print result
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
