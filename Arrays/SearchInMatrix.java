package Arrays_Java.Arrays;
public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 },
                { 231, 302, 314, 610 }
        };
        int target = 34;
        boolean ans = search(arr, target);
        System.out.println(ans);

    }

    public static boolean search(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid][0] <= target && arr[mid][arr[mid].length - 1] >= target) {
                int left = 0;
                int right = arr[mid].length - 1;

                while (left <= right) {
                    int mid2 = left + (right - left) / 2;
                    if (arr[mid][mid2] == target) {
                        return true;
                    } else if (arr[mid][mid2] < target) {
                        left = mid2 + 1;
                    } else {
                        right = mid2 - 1;
                    }

                }
                break;
            } else if (arr[mid][0] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
