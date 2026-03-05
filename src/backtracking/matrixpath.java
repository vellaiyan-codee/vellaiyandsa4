package backtracking;

import java.util.Arrays;

public class matrixpath {
    public static void main(String[] args) {
        boolean [][] board=  {
                {true,true,true},
                {true,true,true},
                {true,true,true},


        };
        int[][] path=new int[board.length][board[0].length];
        matrixprint(" ",board,0,0,path,1);

    }
    static void matrixprint(String p,boolean[][] maze, int r ,int c, int [][] path,int step){
        if (r==maze.length-1 && c==maze[0].length-1){
            for (int[]arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[r][c]==false){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if (r<maze.length-1){
            matrixprint(p+'D',maze,r+1,c,path,step+1);
        }
        if (c<maze[0].length-1){
            matrixprint(p+'R',maze,r,c+1,path,step+1);
        }
        if (r>0){
            matrixprint(p+'U',maze,r-1,c,path,step+1);
        }
        if (c>0){
            matrixprint(p+'L',maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
