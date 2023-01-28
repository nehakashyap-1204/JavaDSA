package code.Array;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] nums = {22, 32, 42, 52, 62};
        count(nums);
    }
    public static void count(int[] nums) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even element in Array: "+ countEven);
        System.out.print("Odd element in Array: "+ countOdd);
    }
}
