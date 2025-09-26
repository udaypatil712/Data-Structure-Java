package Binary_Search;

public class O7_FindMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 0, 1, 2, 3 };
        int target = 0;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    public static int Search(int[] arr, int target) {
        int peak = PeakIndex(arr, target);
        System.out.println(peak);
        int firstTry = OrderAgnostic(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return OrderAgnostic(arr, target, peak + 1, arr.length - 1);
        }

    }

    public static int OrderAgnostic(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[s] > arr[mid]) { // desending
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } else { // asending
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }

        }
        return -1;
    }

    public static int PeakIndex(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }
}
