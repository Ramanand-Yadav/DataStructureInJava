package Arrays.Medium;
import java.util.*;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        setZeros(arr);
        for(int[] av : arr){
            for(int val : av){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        setZerosOptimal(arr);
    }
    private static void setZerosOptimal(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int col0 = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    if(j!=0){
                        arr[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        for(int j=m-1; j>0; j--){
            if(arr[0][0]==0){
                arr[0][j]=0;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(col0==0){
                arr[i][0]=0;
            }
        }
    }
    private static void setZeros(int[][] arr){
        int n = arr.length; 
        int m = arr[0].length;
        boolean[] colums = new boolean[m];
        boolean[] row = new boolean[n];
        boolean[][] mark = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==0){
                    // makeRowZeros(arr,row,i,m);
                    // makeColumnsZeros(arr, colums, j, n);
                    mark[i][j] = true;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mark[i][j]==true){
                    makeRowZeros(arr, row, i, m);
                    makeColumnsZeros(arr, colums, j, n);
                }
            }
        }
    }

    private static void makeColumnsZeros(int[][] arr, boolean[] colums, int col, int n){
        if(colums[col]==true){
            return;
        }else{
            for(int i=0; i<n; i++){
                arr[i][col]=0;
            }
            colums[col]=true;
        }
    }
    private static void makeRowZeros(int[][] arr, boolean[] row, int r, int m){
        if(row[r]==true){
            return;
        }else{
            for(int i=0; i<m; i++){
                arr[r][i]=0;
            }
            row[r] = true;
        }
    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        int col0 =1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(i).set(0,0);
                    if(j==0){
                        col0 = 0;
                    }else{
                        matrix.get(0).set(j,0);
                    }
                }
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix.get(i).get(j)!=0){
                    if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){
                        matrix.get(i).set(j,0);
                    }
                }
            }
        }
        for(int j=m-1; j>0; j--){
            if(matrix.get(0).get(0)==0){
                matrix.get(0).set(j,0);
            }
        }
        for(int i=n-1; i>=0; i--){
            if(col0==0){
                matrix.get(i).set(0,0);
            }
        }
        return matrix; 
    }
    
}
