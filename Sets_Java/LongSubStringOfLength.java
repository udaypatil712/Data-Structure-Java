package Sets_Java;

import java.util.HashSet;
import java.util.Set;

public class LongSubStringOfLength {
    public static void main(String[] args) {
        String str = "abcabcbb";
        lengthOfString(str);
    }

    public static void lengthOfString(String str) {
        // int count = 0;
        Set<String> st = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                st.add(str.substring(i, j));
            }
        }
        System.out.println(st);
    }
}
