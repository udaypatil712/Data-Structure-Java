package Arrays_Java;

 

public class LastIndex {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,7};
        int[] a=new int[arr.length];
       
       for(int i=0;i<arr.length;i++){
         a[i] = arr[i];
         a[a.length-1] = arr[arr.length-1] +1;
         System.out.print(a[i]);
       }
    }
}
