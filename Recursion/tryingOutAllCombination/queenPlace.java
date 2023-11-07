package Recursion.tryingOutAllCombination;

import java.util.*;


public class queenPlace {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>>ans = solveNQueens(n);
        for(List<String>al:ans){
            System.out.println(al);
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>>ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        placeQueens(board,n,0,n,ans);
        return ans;
    }
    public static void placeQueens(char[][]board,int tnq,int bno,int n,List<List<String>>ans){
        if(tnq==0){
            List<String>al = new ArrayList<>();
            for(int i=0; i<board.length; i++){
                String path = "";
                for(int j=0; j<board.length;j++){
                    path+=board[i][j];
                }
                al.add(path);
            }
            ans.add(al);
            return;
        }
        for(int brix=bno;brix<n*n; brix++){
            int r = brix/n; int c = brix%n;
            boolean flag = isQueenSafe(board,r,c);
            if(flag==true && board[r][c]=='.'){
                board[r][c]='Q';
                placeQueens(board, tnq-1, brix+1, n, ans);
                board[r][c]='.';
            }
        }
    }
    public static boolean isQueenSafe(char[][]board, int r, int c){
        int[][] dir = {{0,-1},{-1,-1},{-1,0},{-1,1}};
        int n = board.length;
        for(int i=0;i<dir.length;i++){
            for(int j=1;j<=n;j++){
                int x = r + j*dir[i][0];
                int y = c+j*dir[i][1];
                if(x>=0&&y>=0&&x<n&&y<n){
                    if(board[x][y]=='Q'){
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
