package Recursion.tryingOutAllCombination;
import java.util.*;
public class sudokuSolve {
    public static void main(String[] args) {
        char[][]board = new char[9][9];
        
        solveSudoku(board);
        //return emplty
    }
    public static void solveSudoku(char[][] board){
        List<Integer>al = new ArrayList<>();
        int n = board.length;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='.'){
                    al.add(i*n+j);
                }
            }
        }
        solve(board,n,al,0);
    }
    public static boolean solve(char[][]board, int n, List<Integer>al, int ind){
        if(ind==al.size()){
            return true;
        }
        int r = al.get(ind)/n;
        int c = al.get(ind)%n;
        for(int i=1; i<=9; i++){
            if(isSafe(board,r,c,i,n)){
                board[r][c]=(char)('0'+i);
                if(solve(board, n, al, ind+1)){
                    return true;
                }
                board[r][c]='.';
            }
        }
        return false;
    }
    public static boolean isSafe(char[][]board,int r, int c, int num, int n){
        //column
        for(int j=0; j<n; j++){
            if(board[r][j]-'0'==num)return false;
        }
        //row
        for(int i=0; i<n;i++){
            if(board[i][c]-'0'==num)return false;
        }
        //3X3 matrix
        int row = (r/3)*3;
        int col = (c/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i+row][j+col]-'0'==num)return false;
            }
        }
        return true;
    }
}

