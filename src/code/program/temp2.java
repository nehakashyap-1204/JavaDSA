package code.program;

import java.util.ArrayList;

public class temp2 {
    public static void main(String[] args) {
        int n = 4;
       ArrayList<ArrayList<String>> ans = new ArrayList<>(n);
   //     System.out.println(solveNQueens(n));

    }
    public static  ArrayList<ArrayList<String>>solveNQueens(int n) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        NQueen(0,n,ans,board);
        return ans;
    }
    static void NQueen(int i, int n, ArrayList<ArrayList<String>>ans, char[][] board) {
        // BASE CASE
        if (i == n){
            ArrayList<String> temp =new ArrayList<>();
            for (int j = 0; j<n; j++) {
                String s = new String(board[j]);
                temp.add(s);
            }
            ans.add(temp);
            return;
        }

        // RECURSION
        for (int j = 0; j < n; j++){
            if (isSafe(i,j,board,n)) {
                board[i][j] = 'Q';
                NQueen(i+1, n, ans, board);
                board[i][j] = '.';
            }
        }
    }
    static boolean isSafe(int i, int j, char[][] board, int n) {
        // VERTICAL UP
        int tempi = i;
        while (tempi >= 0){
            if (board[tempi][j] == 'Q')
                return false;
            tempi--;
        }

        // DIAGONAL RIGHT
        tempi = i;
        int tempj = j;
        while (tempi >= 0 && tempj <= n-1) {
            if(board[tempi][tempj] == 'Q')
                return false;
            tempi--;
            tempj++;
        }
        // LEFT DIAGONAL
        tempi = i;
        tempj = j;
        while (tempi >= 0 && tempj>= 0){
            if(board[tempi][tempj] == 'Q')
                return false;
            tempi--;
            tempj--;
        }
        return true;
    }
}
