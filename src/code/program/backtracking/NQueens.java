package code.program.backtracking;
public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        NQueens(board,0);
    }
    static boolean IsSafe(char[][] board, int row, int col){
        // vertical up
        for (int i = row -1; i >= 0; i--) {
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal left
        for (int i = row -1, j = col -1; i >= 0 && j >= 0; i--,j--) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        // diagonal right
        for (int i = row -1, j = col + 1; i >= 0 && j < board.length ; i--, j++) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    static void NQueens(char[][] board, int row){
        if (row == board.length){
            printBoard(board);
            return;
        }
        // column loop
        for (int col = 0; col < board.length; col++) {
            if (IsSafe(board,row, col)){
                board[row][col] = 'Q';
                NQueens(board,row + 1);
                board[row][col] = 'X';
            }

        }

    }
    static void printBoard(char[][] board){
        System.out.println("----chess board----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


}