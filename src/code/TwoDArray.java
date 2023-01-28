package code;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        int[][] brr = {
                {4,5,6},
                {7,8,9}
        };
        int[][] res = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = arr[i][j] + brr[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                res[i][j] = arr[i][j] + brr[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


    }
}
