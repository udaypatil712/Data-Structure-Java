package LeetCode_Questions_Approach;

public class TwoPointer {
    public static void main(String[] args) {
        String str="madamwef";
        int s=0;
        int e=str.length()-1;
         
        while (s<=e) {
            if(str.charAt(s) != str.charAt(e)){
               System.out.println("is Not Plaindrome.."+ str);
               break;
            }  
            else{
                System.out.println("is Plaindrome..");
            }
            s++;
            e--;
        }
        
    }
}
