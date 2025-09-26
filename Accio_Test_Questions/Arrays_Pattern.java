package Accio_Test_Questions;

public class Arrays_Pattern {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,1,6};

        int max = 0;
        // Find the maximum value in the array to know how many rows to print
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Print the pattern row by row
        for (int row = 1; row <= max; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[col] >= row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // print space if star is not needed
                }
            }
            System.out.println(); // move to next line
        }
    }
}
