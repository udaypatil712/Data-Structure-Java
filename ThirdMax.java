package Arrays_Java;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr={3,2,4,1};
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;
        int tlargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                tlargest=slargest;
                slargest=largest;
                largest=arr[i];
            }else if(arr[i] < largest && arr[i] > slargest){
                tlargest=slargest;
                slargest=arr[i];
            }
            if (arr[i] < largest && arr[i] < slargest ) {
                tlargest=arr[i];
            } 
        }
        System.out.println(slargest);
        System.out.println(tlargest);
        System.out.println(largest);
     
        
    }
}
