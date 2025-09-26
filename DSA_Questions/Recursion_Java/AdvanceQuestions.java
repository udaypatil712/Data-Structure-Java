package Recursion_Java;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AdvanceQuestions {
    public static void main(String[] args) {
        // String str = "abc";
        // String str1 = "def";
        // String ans = "";

        // int i = 0;
        // System.out.println(removeA(str, i, ans));

        // skipA(str, ans);

        // skipWord(str, ans);

        // subSet(ans, str);

        // System.out.println(skipString2(str, ans));


    //     List<String> list = new ArrayList<>();
    //    permutationsCombinations(str,ans,list) ;
    //     Collections.sort(list);
    //     String target = "213";
    //     System.out.println(list.get(3));

        // possibleCombinationTwoString(str,ans,0);
        
        // String str="1234";
        // String ans = "";
        // int k=2;
        // uniqueCombinationsOfK(str,ans,k);

        // int[] arr={1,4,3,2};
        // Arrays.sort(arr);
        // int k=2;
        // List<Integer> ans = new ArrayList<>();
        // uniqueCombinationsOfkArr(arr,ans,k,0);
        // System.out.println(list);
        
    }

    public static String removeA(String str, int i, String ans) {
        if (i == str.length()) {
            return ans;
        }
        char ch = str.charAt(i);
        if (ch != 'a') {
            ans += ch;
        }
        return removeA(str, i + 1, ans);
    }

    public static void skipA(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            // remove starting from first index =>bccb after this is our new string =>bccb
            skipA(str.substring(1), ans);
        } else {
            // if not then remove first elment from our string its becomes=> ccb after that
            // add into the (ans + ch)
            skipA(str.substring(1), ans + ch);
        }
    }

    public static void skipWord(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if (str.startsWith("apple")) {
            skipWord(str.substring(5), ans);
        } else {
            skipWord(str.substring(1), ans + ch);
        }
    }

    // only add return type and return the String
    public static String skipString2(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        char ch = str.charAt(0);
        if (str.startsWith("apple")) {
            return skipString2(str.substring(5), ans);
        } else {
            return skipString2(str.substring(1), ans + ch);
        }
    }

    public static void subSet(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        subSet(ans + ch, str.substring(1));
        subSet(ans, str.substring(1));
    }

    public static List<String> permutationsCombinations(String str, String ans, List<String> list) {
        if (str.isEmpty()) {
            list.add(ans);
            return list; // base case → print one permutation
        }

        char ch = str.charAt(0); // pick first character

        for (int i = 0; i <= ans.length(); i++) {
            String s = ans.substring(0, i); // prefix of 'ans'
            String e = ans.substring(i, ans.length()); // suffix of 'ans'

            // Insert 'ch' at position i
            list = permutationsCombinations(str.substring(1), s + ch + e, list);
        }
        return list;
    }

    public static void possibleCombinationTwoString(String str, String ans, int i) {
        if (str.length() == i) {
            System.out.println(ans);
            return;
        }
        if (i <= str.length() - 1) {
            char ch = str.charAt(i);
            possibleCombinationTwoString(str, ans + ch, i + 1);

        }
    }

    public static void uniqueCombinationsOfK(String str, String ans, int k) {
        if (ans.length()==k) {
            System.out.println(ans);
            return;
        }
        if (str.isEmpty()) {
            return;
        }
        char ch = str.charAt(0);
        uniqueCombinationsOfK(str.substring(1), ans+ch, k);
        uniqueCombinationsOfK(str.substring(1), ans, k);
    }

    static List<List<Integer>> list = new ArrayList<>();
    public static void uniqueCombinationsOfkArr(int[] arr,List<Integer> ans , int k,int i){
        if (ans.size() == k) {
            list.add(new ArrayList<>(ans));
            return;
        }
        if (i == arr.length) {
            return;
        }
        ans.add(arr[i]);
        uniqueCombinationsOfkArr(arr, ans, k, i+1);

        ans.remove(ans.size() - 1);
        uniqueCombinationsOfkArr(arr, ans, k, i+1);
    }


}
