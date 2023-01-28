package code.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {22, 32, 42, 52, 62};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int nums[]) {
        int l = 0;
        int r = nums.length -1;
        while (l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

}
