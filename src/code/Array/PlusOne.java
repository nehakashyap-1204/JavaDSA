package code.Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digit1 = {1,2,3};
        int[] digits2 = {4,3,2,1};
        int[] digits3 = {9};

        int[] ans = plusOne(digits2);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n -1; i >= 0; i--) {
            if(digits[i]  != 9){
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }

        }
        if (digits[0] == 0){
            int[] temp = new int[n+1];
            temp[0] = 1;
            return temp;
        }

        return digits;
    }
}
