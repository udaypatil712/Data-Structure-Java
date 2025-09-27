package Recursion_Java;

 
import java.util.ArrayList;
import java.util.List;

public class PermutationsCombinations {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> ans = new ArrayList<>();
        combinationsSum(arr, ans, 0, 0,7);
        System.out.println(list);

    }

    static List<List<Integer>> list = new ArrayList<>();
    // unique Elements of Sum
    public static void combinationsSum(int[] arr,ArrayList<Integer> ans,int i,int sum,int target){
        if(i == arr.length){
            if (sum == target) {
                list.add(new ArrayList<>(ans));
            }
            return;
        }
        ans.add(arr[i]);
        combinationsSum(arr, ans, i+1 , sum+arr[i],target);
        ans.remove(ans.size() -1);
        combinationsSum(arr, ans, i+1, sum,target);
    }
    
    
}
