package code.Array;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr = {5,14,8,6,3,4,-1,2,0,7,8,55,99};
        findMinAndMax(arr);
    }
    public static void findMinAndMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
           if (max < arr[i]){
               max = arr[i];
           }
           if (min > arr[i]){
               min = arr[i];
           }
        }
        System.out.printf("%d,%d",min,max);
    }

}
