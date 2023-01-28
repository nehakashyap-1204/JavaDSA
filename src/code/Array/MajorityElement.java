package code.Array;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,3,3,4,5,4,3,4,5};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length /2];
    }


}
