package code.Array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,4,5,8,5,2,1,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

    }
}
