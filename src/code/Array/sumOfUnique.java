package code.Array;

public class sumOfUnique {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(sumOfUniqueElement(nums));
    }
    /*
    public static int sum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] > max)
                max = nums[i];
        }

        int[] count = new int[max+1];

        for(int i = 0; i < n; i++){
            count[nums[i]]++;
        }

        int sum = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] == 1)
                sum += i;
        }
        return sum;
    }

     */
    public static int sumOfUniqueElement(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            boolean unique = UniqueCheck(i,nums);
            if (unique) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean UniqueCheck(int num, int[] arr) {
        int count = 0;
        for (int i : arr){
            if (i == num){
                ++count;
            }
            if (count > 1){
                return false;
            }
        }
        return true;
    }



}
