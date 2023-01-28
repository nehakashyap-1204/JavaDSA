package code.program.backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
             };

        pathBackTrack("",maze,0,0);

    }
    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;   // base condition
        }
        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    static void path(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if (r > 1){
            path(p + 'D',r-1,c);
        }

        if (c > 1){
            path(p + 'R', r,c-1);
        }
    }

    static ArrayList pathRet(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1){
            list.addAll(pathRet(p + 'D',r-1,c));
        }

        if (c > 1){
            list.addAll(pathRet(p + 'R', r,c-1));
        }
       return list;
    }

    static ArrayList pathRetDiagonal(String p, int r, int c){
        if (r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1){
            list.addAll(pathRetDiagonal(p + 'D', r-1,c-1));
        }
        if (r > 1){
            list.addAll(pathRetDiagonal(p + 'V',r-1,c));
        }

        if (c > 1){
            list.addAll(pathRetDiagonal(p + 'H', r,c-1));
        }
        return list;
    }
    static void pathRestriction(String p, boolean[][] maze, int r, int c){
        if (r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false){
            return;
        }
        if (r < maze.length -1 ) {
            pathRestriction(p + 'D', maze, r + 1, c);
        }
        if ( c < maze[0].length -1){
            pathRestriction(p + 'R', maze, r,c + 1);
        }
    }
    static void pathBackTrack(String p, boolean[][] maze, int r, int c){
        if (r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        // consider this is in path
        maze[r][c] = false;
        if (r < maze.length -1 ) {
            pathBackTrack(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length -1){
            pathBackTrack(p + 'R', maze, r,c + 1);
        }
        if (r > 0){
            pathBackTrack(p + 'U',maze,r-1,c);
        }
        if (c > 0){
            pathBackTrack(p + 'L',maze,r,c-1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that calls
        maze[r][c] = true;
    }





}
