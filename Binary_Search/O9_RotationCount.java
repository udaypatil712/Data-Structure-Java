package Binary_Search;

public class O9_RotationCount {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 2, 3, 4 };
        int count = RotationCount(arr);
        System.out.println(count);

        if (count == -1) {
            System.out.println(0);
        } else {
            // right to left
            // System.out.println(count + 1)

            // left to right count
            System.out.println(arr.length - (count + 1));
        }

    }

    public static int RotationCount(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (s < mid && e > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (e > mid && s < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[0] > arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
