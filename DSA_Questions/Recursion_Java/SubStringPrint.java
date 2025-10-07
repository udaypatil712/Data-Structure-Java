package Recursion_Java;

public class SubStringPrint {
    public static void main(String[] args) {
        String str = "abc";
       
        int i=0;
         subStringPrint(str, 0);

    }
    public static void subStringPrint(String str , int i){
        if ( i == str.length()) {
            return;
        }
        String ans="";
        for(int j=i;j<str.length();j++){
            char ch = str.charAt(j);
            ans +=ch;
            System.out.println(ans);
        }
        subStringPrint(str, i+1);
    }
}
