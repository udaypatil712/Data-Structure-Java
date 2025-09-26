package Stack_Java;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "[]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else{
                if (st.isEmpty()) { // means satck size is 0
                    return false;
                }
                char top = st.peek(); // this will give us the top of element of stack (previous element of satck)
                if ( (ch == ')' && top == '(' ) || 
                    (ch == '}' && top == '{') || 
                    (ch == ']' && top == '[') ) {
                    st.pop(); 
                }else{
                    return false;
                }
            }
        }
        // means satck size is 0=> it's give true
        if (st.size() == 0) {
            return true ;
        }else{
            return false;
        }     
    }
}
