package Stack_Java;

import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        String str="((a+b)+((a+b)))";
        boolean ans=balancedBrackets(str);
        System.out.println(ans);
 
    }
    public static boolean balancedBrackets(String str){
        Stack<Character> st =new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    st.pop();
                    return true;
                }else{
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        return false;
    }
}
