package Arrays_Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection2 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> ans=findDisappearedNumbers(nums);
        System.out.println(ans);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> seen =new HashSet<>();
        for(int num : nums){
            seen.add(num);
        }
        
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if (!seen.contains(i)) {
                list.add(i);
            }
        }
        return list;
        
    }
    
}
