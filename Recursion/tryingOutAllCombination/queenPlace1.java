package Recursion.tryingOutAllCombination;

import java.util.*;
public class queenPlace1 {
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>>ans = nQueens(n);
        System.out.println(ans.size());
        for(List<Integer>al:ans){
            System.out.println(al);
        } 
    }
    public static List< List< Integer > > nQueens(int n)
    {
        // Write your code here.
        List<List<Integer>>ans = new ArrayList<>();
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]=0;
            }
        }
        placeQueens(board,n,0,n,ans);
        return ans;
    }
    public static void placeQueens(int[][]board,int tnq,int bno,int n,List<List<Integer>>ans){
        // System.out.println(ans.size());
        if(tnq==0){
            List<Integer>al = new ArrayList<>();
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board.length;j++){
                    al.add(board[i][j]);
                }
            }
            ans.add(al);
            // System.out.println(ans.size());
            return;
        }
        for(int brix=bno;brix<n*n; brix++){
            int r = brix/n; int c = brix%n;
            boolean flag = isQueenSafe(board,r,c);
            if(flag==true && board[r][c]==0){
                board[r][c]=1;
                placeQueens(board, tnq-1, brix+1, n, ans);
                board[r][c]=0;
            }
        }
    }
    public static boolean isQueenSafe(int[][]board, int r, int c){
        int[][] dir = {{0,-1},{-1,-1},{-1,0},{-1,1}};
        int n = board.length;
        for(int i=0;i<dir.length;i++){
            for(int j=1;j<=n;j++){
                int x = r + j*dir[i][0];
                int y = c+j*dir[i][1];
                if(x>=0&&y>=0&&x<n&&y<n){
                    if(board[x][y]==1){
                        return false;
                    }
                }else{
                    break;
                }
            }
        }
        return true;
    }
}
