package Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] nums ={1,1,2};
        int ans =removeDuplicates(nums);
        System.out.println(ans);
    }



  public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
                
            }
        }
        return ++j;
    }
}
