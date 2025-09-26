package Binary_Search;

public class O6_PeakIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 5, 4, 3 };
        int ans = searchPeakIndex(arr);
        System.out.println(ans);
    }

    public static int searchPeakIndex(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // 1, 2, 3, 4, 5, 6, 5, 4, 3 => arr[m]=5 < arr[m+1]=6 => 6, 5, 4, 3
                // then search the element in descending array means right side of middle
                s = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                // 1, 2, 3, 6, 5, 4, 3 => arr[m]=6 > arr[m+1]=5 => 1, 2, 3, 6
                // after that element is not in first condition then search left side of middle
                // element
                e = mid;
            }
        }
        // 1st => 1, 2, 3, 6, 5, 4, 3 => arr[m]=6 > arr[m+1]=5 => 1, 2, 3, 6
        // 2nd => 3 6 => arr[s]=3 , arr[m] = 3 ,arr[e]=6
        // 3rd => s+e/2 => arr[s]=6 , arr[e]=6
        // 4th => while(s=3 < e=3) oR (s == e)and that time break this condition
        // 5th => then they will return s or e you can write both of an one
        // 6th => return index of peak element

        return e; // s
    }
}
