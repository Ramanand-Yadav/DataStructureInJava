package Recursion.tryingOutAllCombination;

import java.util.ArrayList;

public class ratMaze {
    public static void main(String[] args) {
        // int[][] m = {{1, 0, 0, 0},{1, 1, 0, 1}, {1, 1, 0, 0},{0, 1, 1, 1}};
        int[][] m = {{1,1},{1,1}};
        int n = 2;
        ArrayList<String> ans = findPath(m, n);
        System.out.println(ans);
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String>ans = new ArrayList<>();
        m[0][0]=0;
        solve(m,n,0,"",ans,0,0);
        return ans;
    }
    public static void solve(int[][]board, int n, int ind, String temp, ArrayList<String>ans,int r, int c){
        if(r==n-1&&c==n-1){
            ans.add(temp);
            return;
        }
        //up
        if(r-1>=0&&r-1<n&&board[r-1][c]==1){
            board[r-1][c]=0;
            solve(board, n, ind, temp+"U", ans, r-1, c);
            board[r-1][c]=1;
        }

        //down
        if(r+1>=0&&r+1<n&&board[r+1][c]==1){
            board[r+1][c]=0;
            solve(board, n, ind, temp+"D", ans, r+1, c);
            board[r+1][c]=1;
        }

        //left
        if(c-1>=0&&c-1<n&&board[r][c-1]==1){
            board[r][c-1]=0;
            solve(board, n, ind, temp+"L", ans, r, c-1);
            board[r][c-1]=1;
        }

        //right
        if(c+1>=0&&c+1<n&&board[r][c+1]==1){
            board[r][c+1]=0;
            solve(board, n, ind, temp+"R", ans, r, c+1);
            board[r][c+1]=1;
        }
        
    }
}
