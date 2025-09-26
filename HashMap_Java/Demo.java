package HashMap_Java;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5};
        int result=XoRWith(arr);
        System.out.println(result);
    }
    public static int XoRWith(int[] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        return result;
    }
}
