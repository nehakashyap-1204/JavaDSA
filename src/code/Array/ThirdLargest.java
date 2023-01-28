package code.Array;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {12,44,5,31,6,70,88};
        int n = arr.length;
        FindThirdMax(arr,n);
    }

    public static void FindThirdMax(int[] arr, int n) {
        int first = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > first)
                first = arr[i];

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (arr[i] > second && arr[i] < first)
                second = arr[i];

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++)
            if (arr[i] > third && arr[i] < second)
                third = arr[i];

        System.out.printf("The third Largest " + "element is %d\n", third);
    }
}
