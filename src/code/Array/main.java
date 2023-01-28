package code.Array;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
   //     int[] arr = {9,9,4,5,8,9,7,5,3,2,5,1};
   //     int[] nums = {55,63,70,95,80,40,21,33,40,60,34};
   //     secondMax(arr);
   //     System.out.println(EvenOddIndices(arr));
   //          marks(nums);
   //     System.out.println(maximum(nums));
   //     OddEven(arr);
   //     System.out.println(greaterthanX(arr));
   //     System.out.println(pairsOfTwo(arr));
   //     System.out.println(pairsOfThree(arr));
        int[] arr = {1,2,3,4,5,6,7};
    //   Reverse(arr);
        ReversePart(arr);
        System.out.println(Arrays.toString(arr));
  //      ReverseCopy(arr);

  //      int[] array = {2,9};
  //      System.out.printf("%d,%d\n",array[0],array[1]);
  //       arr(array);
    }
    public static void arr(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        System.out.printf("%d,%d",array[0],array[1]);
    }
    public static void marks(int[] arr){
        int passingMark = 35;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < passingMark){
                System.out.print(arr[i] +" ");
            }
        }
    }

    public static int maximum(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
   public static void OddEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
        if (i % 2 != 0)
            arr[i] = arr[i] * 2;
        else
            arr[i] = arr[i] + 10;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int greaterthanX(int[] arr){
        int x = 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x){
                count++;
            }
        }
        return count;
    }

    public static int EvenOddIndices(int[] arr) {
        int EvenSum = 0;
        int OddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                EvenSum = EvenSum + arr[i];
            } else {
                OddSum = OddSum + arr[i];
            }
        }
        return OddSum - EvenSum;
    }

    public static void secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                smax = max;
                max = arr[i];
            } else if (smax < arr[i] && max != arr[i]){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }

    public static int pairsOfTwo(int[] arr) {
        int x = 12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                    System.out.printf("(%d,%d)\n",arr[i],arr[j]);
                }
            }
        }
        return count;
    }

    public static int pairsOfThree(int[] arr) {
        int x = 12;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                for (int k = j +1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x){
                        count++;
                        System.out.printf("(%d,%d,%d)\n", arr[i],arr[j],arr[k]);
                    }
                }
            }
        }
        return count;
    }

    public static void ReverseCopy(int[] arr) {
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[6 -i];
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }

    public static void Reverse(int[] arr) {
        int i = 0;
        int j = arr.length -1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void ReversePart(int[] arr) {
        // for loop
   //     for (int i = 1, j= 4; i <= j; i++,j--) {
   //        int temp = arr[i];
   //        arr[i] = arr[j];
   //        arr[j] = temp;

        // while loop
        int i = 1;
        int j = 4;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
              i++;
              j--;
        }
    }
}

