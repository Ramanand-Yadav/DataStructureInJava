package Recursion.tryingOutAllCombination;

import java.util.*;

public class wordSearch {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the number of row and column with space seprate : ");
            int n = scn.nextInt(); int m = scn.nextInt();
            char[][] board=new char[n][m];
            System.out.println("Enter n*m character");
            for(int i=0; i<n; i++){
                for(int j=0;j<m;j++){
                    board[i][j] = scn.next().charAt(0);
                }
            }
            System.out.println("Enter the word");
            String str = scn.next();
            System.out.println(exist(board, str));
        }
    }
    public static boolean exist(char[][] board, String word) {
        int n=board.length;
        int m = board[0].length;
        boolean[][] check = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                boolean val = solve(board,check,0,word,i,j,n,m);
                if(val)return true;
            }
        }
        return false;
    }
    public static boolean solve(char[][]board,boolean[][]check,int ind,String word,int r,int c, int n, int m){
        if(ind>=word.length())return true;
        if(r<0||r>=n||c<0||c>=m||check[r][c]==true||board[r][c]!=word.charAt(ind)){
            return false;
        }
        check[r][c]=true;
        
        boolean right = solve(board, check, ind+1, word, r+1, c, n, m);
        
        boolean left = solve(board, check, ind+1, word, r-1, c, n, m);
        
        boolean up = solve(board, check, ind+1, word, r, c+1, n, m);
        
        boolean down = solve(board, check, ind+1, word, r, c-1, n, m);
        
        check[r][c]=false;
        return right||left||up||down;
    }
}
