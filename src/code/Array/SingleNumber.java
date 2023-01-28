package code.Array;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,1,5,3,1,5,2};
        System.out.println(IsItSingle3(nums));
    }
    public static int IsItSingle(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    flag = false;
                }
            }
            if (flag == true)
                return nums[i];
        }
        return -1;
    }
// TC = O(N^2)
// SC = O(1)
    public static int IsItSingle2(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
// TC = O(N)
// SC = O(1)
    public static boolean  IsItSingle3(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
