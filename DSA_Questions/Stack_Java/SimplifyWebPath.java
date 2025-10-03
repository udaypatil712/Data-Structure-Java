package Stack_Java;

import java.util.Stack;

public class SimplifyWebPath {
    public static void main(String[] args) {
        String str = "/home//user/";
        // System.out.println(str.charAt(str.length()-1));
        System.out.println(checkPath(str));
    }

    public static String checkPath(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (st.empty() && ch == '/') {
                st.push(ch);
                ans = ans + ch;
            }
            else if (ch >= 'a' && ch <= 'z') {
                st.push(ch);
                ans+=ch;
            }
            else{
                char top = st.peek();
                if (top == '/' && ch == '/') {
                    st.pop();
                    // ans+=ch;
                }else{
                    // st.push(ch);
                    ans+=ch;
                }
            }

            if (str.charAt(n-1) == '/') {
                st.push(ch);
                // st.pop();
            }

        }
        //  if (str.charAt(n-1) == '/') {
            
        // }
        System.out.println(st);
        return ans;
    }

}
