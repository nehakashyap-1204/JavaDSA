package code.Array;

import java.util.Arrays;

public class SortArrayInAscendingOrder {
    public static void main(String[] args) {
        int[] nums = {2,8,7,1,5};
        sortArray2(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortArray(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }
    public static void sortArray2(int[] nums) {
        Arrays.sort(nums);
        
    }
}
