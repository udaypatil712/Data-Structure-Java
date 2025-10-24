package Arrays;

public class IndexOfDomiElem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(indexOfLarge(arr));
    }

    public static int indexOfLarge(int[] arr) {
        int max = arr[0];
        int maxInd = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxInd = i;
            }
        }
        System.out.println(maxInd);
        boolean isfound = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[maxInd] && arr[i] * 2 > arr[maxInd]) {
                isfound = false;
                break;
            }
        }

        return (isfound ? maxInd : -1);
    }
}
