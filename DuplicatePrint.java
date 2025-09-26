package Arrays_Java;

public class DuplicatePrint {
    public static void main(String[] args) {
        int[] arr = { 0,0,1,1,1,2,2,3,3,4 };
        int ans=printDuplicate(arr);
        System.out.println(ans);

    }

    public static int printDuplicate(int[] arr) {

         int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i]);
                } 
            }
        }
 return count;




        // int j=1;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i] != arr[i-1]){
        //         arr[j]=arr[i];
        //         j++; 
              
        //     }
        // }
        // return j;
 
    }
}
