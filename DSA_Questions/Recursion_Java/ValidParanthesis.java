package Recursion_Java;

import java.util.ArrayList;
import java.util.List;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str="()()())(";
        int count=0;

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            String sub = str.substring(i, i + 2);
            if (checkParenthesis(str, count) == true) {
                list.add(sub);
            }else{
                System.out.println("invalid..");
            }
        }
        System.out.println(list);
         
    }

    public static boolean checkParenthesis(String str,int count){
         
        for(int i=0;i<str.length();i++){
         
            char ch = str.charAt(i);
            if (ch == '(') {
                count++;
            }else if (ch == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count==0;
    }
     
}
