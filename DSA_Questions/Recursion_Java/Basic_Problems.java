package Recursion_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic_Problems {
    public static void main(String[] args) {

        // int n=5;
        // int ans=fibonaciNumber(n);
        // System.out.println(ans);

        // int n=1;
        // int ans=printNumber(n);
        // System.out.println(ans);

        // int n=5;
        // int ans = printNumberReverse(n);
        // System.out.println(ans);

        // int[] arr = { 1, 2, 3, 4, 5 };
        // reverseArray(arr, 0,arr.length-1);
        // System.out.println(Arrays.toString(arr));
        // for(int ans : arr){
        // System.out.print(ans);
        // }

        // int n = 5;
        // int ans = factorialOfNumber(n);
        // System.out.println(ans);

        // int n=1342;
        // int ans=sumOfDigit(n);
        // System.out.println(ans);

        // reverseOfNumber(1200);

        // boolean ans = palindromNumber(121);
        // System.out.println(ans);

        // int[] arr={1,2,3,4,2,5};
        // boolean ans=checkArraySort(arr,0);
        // System.out.println(ans);

        // int[] arr={21,2,3,1,54};
        // int target =212;
        // boolean ans=checkElementPresent(arr,target,0);
        // System.out.println(ans);

        // int[] arr={1,2,3,3,3,3,45,2};
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> ans=storedIndexArrayList(arr, 3, 0, list);
        // System.out.println(ans);

        // patternPrint(5,0,0);
        // patternPrint2(5,0,0);
        // patternPrint3(5,0,0);

        //.....Bubble Sort.....

        // int[] arr={5,4,6,7,2};
        // int[] ans=bubbleSort(arr, 0,0);
        // System.out.println(Arrays.toString(ans));

        // String str="banana";
        // PrintSubString(str,0,0);
        // System.out.println(listSub);


    }

    public static int fibonaciNumber(int n) { // 0 1 1 2 3 5 8....
        if (n < 2) {
            return n;
        }
        return fibonaciNumber(n - 1) + fibonaciNumber(n - 2);

    }

    public static int printNumber(int n) { // 1 2 3 4 5
        if (n == 5) {
            return n;
        }
        System.out.println(n);
        return printNumber(n + 1);
    }

    public static int printNumberReverse(int n) { // 5 4 3 2 1
        if (n == 1) {
            return n;
        }
        System.out.println(n);
        return printNumberReverse(n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    public static int factorialOfNumber(int n) {
        if (n == 1) {
            return 1;
        }
        return factorialOfNumber(n - 1) * n;
    }

    public static int sumOfDigit(int n) {
        if (n % 10 == n) { // (n == 0) => return 1;
            return n;
        }
        return n % 10 * sumOfDigit(n / 10);
    }

    public static void reverseOfNumber(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        System.out.print(rem);
        reverseOfNumber(n / 10);
    }

    public static boolean palindromNumber(int n) {
        String rev = "";
        if (rev.equals(n)) {
            return true;
        }else
       
       
        int rem = n % 10;
        rev = rev + rem;
        palindromNumber(n/10);
       
    }

    public static boolean checkArraySort(int[] arr,int i){
        if (i == arr.length-1) {
              return true;
        }
        return arr[i] < arr[i+1] && checkArraySort(arr, i+1);
    }

    public static boolean checkElementPresent(int[] arr , int target , int i){
        if (i == arr.length) {
            return false;
        }
        if(arr[i] == target){
            return true;
        }
       return checkElementPresent(arr, target, i+1);
    }

    public static ArrayList<Integer> storedIndexArrayList(int[] arr , int target , int i, ArrayList<Integer> list){
        if (i == arr.length) {
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return storedIndexArrayList(arr, target, i+1, list);
    }

    public static void patternPrint(int n,int i,int j ){
        if(i == n){
            return;
        }
        if (j < n - i) {
            System.out.print("* ");
            patternPrint(n, i, j+1);
        }else{
            System.out.println();
            patternPrint(n, i+1, 0);
        }
        
    }

    public static void patternPrint2(int n,int i,int j ){
        if (i == n) {
            return;
        }
        if (j <= i) {
            System.out.print("  ");
            patternPrint2(n, i, j+1);
            
        }else{
            System.out.println();
            patternPrint2(n, i+1, 0);
        }
    }

    public static void patternPrint3(int n , int i , int j){
        if(i == n){
            return;
        }
        patternPrint(n, i, j);
        patternPrint2(n, i, j);
    }

    public static int[] bubbleSort(int[] arr , int i , int j){
        if(i== arr.length){
            return arr;
        }
        // for(int j = 0 ; j < arr.length-1-i;j++){
        //     if (arr[j] > arr[j+1]) {
        //         int temp = arr[j];
        //         arr[j] =arr[j+1];
        //         arr[j+1] = temp;
        //     }
        //     System.out.println(Arrays.toString(arr));
        // }
        
        if (j < arr.length-1-i) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
            return bubbleSort(arr, i, j+1);
        }
        else{
            return bubbleSort(arr, i+1, 0);
        }
    } 


    static List<String> listSub = new ArrayList<>();
    public static void PrintSubString(String str , int i , int j){
        if(i == str.length()){
            return;
        }
        // for(int j = i+1;j<str.length();j++){
        //     listSub.add(str.substring(i, j));
        // }
       
        if (j <= str.length()) {
            if (j > i) {
                listSub.add(str.substring(i, j));
            }
            PrintSubString(str, i, j+1);
        }else{
            PrintSubString(str, i+1,i+1);
        }
    }

}
 