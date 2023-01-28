package code.Array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates2(nums));
       
    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length -1; i++){
            if (nums[i] != nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
// Second Approach
    public static int removeDuplicates2(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                j++;
            }
        }
        return j;
    }
// Third Approach
    public static void removeDuplicate3(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (i < arr.length - 1 && arr[i] == arr[i+1]){
                continue;
            }
            arr[count] = arr[i];
            count++;
        }
        System.out.println(arr[count]+ " ");
    }
}
