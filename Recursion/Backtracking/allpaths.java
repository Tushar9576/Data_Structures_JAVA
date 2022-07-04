package backtracking;
import java.util.Arrays;
import java.util.LinkedList;

public class allpaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][] path = new int[board.length][ board[0].length];
        allpathprint("",board,0,0,path,1);
    }
    static void allpaths(String p, boolean [][] maze,int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // I am considering this block in my path
        maze[r][c] = false;

        if(r < maze.length-1){
            allpaths(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            allpaths(p+'R', maze,r, c+1);
        }
        if(r > 0){
            allpaths(p+'U',maze,r - 1,c);
        }
        if(c > 0){
            allpaths(p+'L', maze, r, c - 1);
        }

        // this line is where the function is over
        // this is the place where the changes made due to functions are changed before the function gets removed
        maze[r][c] = true;
    }
    static void allpathprint(String p, boolean [][] maze,int r, int c, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
                
            }
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // I am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length-1){
            allpathprint(p+'D',maze,r+1,c,path,step + 1);
        }
        if(c < maze[0].length-1){
            allpathprint(p+'R', maze,r, c+1,path,step + 1);
        }
        if(r > 0){
            allpathprint(p+'U',maze,r - 1,c,path,step + 1);
        }
        if(c > 0){
            allpathprint(p+'L', maze, r, c - 1,path,step + 1);
        }
        // this line is where the function is over
        // this is the place where the changes made due to functions are changed before the function gets removed
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
