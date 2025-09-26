package Binary_Search;

public class O3_CelingLetter {
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        char target = 'j';
        char ans = GreaterThanTarget(arr, target);
        System.out.println(ans);
    }

    public static char GreaterThanTarget(char[] arr, char target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
                
            }
        }
        return arr[s % arr.length];
    }
}
