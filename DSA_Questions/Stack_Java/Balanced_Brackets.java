package Stack_Java;

import java.util.Stack;

public class Balanced_Brackets {
    public static void main(String[] args) {
        String str="([(a+b) + {(c+d)) * (e/d)}]";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){ 
            char ch=str.charAt(i);
            if (ch == '[' || ch == ']') {
                if (ch == '[') {
                    st.push(ch);
                }else{
                    st.pop();
                }
            }
            if (ch == '(' || ch == ')') {
                if (ch == '(') {
                    st.push(ch);
                }else{
                    st.pop();
                }
            }
             if (ch == '{' || ch == '}') {
                if (ch == '{') {
                    st.push(ch);
                }else{
                    st.pop();
                }
            }
        }
        int currentSize =st.size();
        if (currentSize == 0) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
