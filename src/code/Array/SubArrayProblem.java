package code.Array;

public class SubArrayProblem {
    public static void main(String[] args) {
        int[] nums = {2,1,4,6,17,5,3};
        System.out.println(numSubarrayBoundedMax(nums,3,7));
    }
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int start = -1, end = -1, result = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > right){
                start = end = i;
                continue;
            }
            if (nums[i] >= left)
                end = i;
            result =  result + end - start;
        }
        return result;
    }
}
