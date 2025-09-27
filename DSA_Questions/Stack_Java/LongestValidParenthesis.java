package Stack_Java;

import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args) {
        String str = ")(()())())";
        System.out.println(validCountPare(str));
    }
    public static int validCountPare(String str){ //  O(n) , O(n)
        int count = 0;
        Stack<Character> st =  new Stack<>();
        
        for(int i =0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
                
            }else{
                if (ch == ')' && st.empty()) {
                    continue;
                }else{
                    char top = st.peek();
                    if (top == '(' && ch == ')') {
                        st.pop();
                        count+=2;
                    }
                }
            }
        }
        return count;
    }
}
