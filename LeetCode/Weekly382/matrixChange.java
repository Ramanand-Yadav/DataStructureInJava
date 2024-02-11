package LeetCode.Weekly382;

public class matrixChange {
    public static void main(String[] args) {
        System.out.println("rama");
        int[][] matrix = {{1,2,-1},{4,-1,6},{7,8,9}};
        int[][] ans = modifiedMatrix(matrix);
        for(int[] arrs : ans){
            for(int val : arrs){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static int[][] modifiedMatrix(int[][] matrix) {
        int[][] ans = new int[matrix.length][matrix[0].length];
        int n = matrix.length; 
        int m = matrix[0].length; 
        for(int i=0; i<n; i++){
            int maxVal = matrix[i][0];
            for(int j=0; j<m; j++){
                if(matrix[i][j]!=-1){
                    ans[i][j]=matrix[i][j];
                }
                maxVal = Math.max(maxVal, matrix[i][j]);
            }
            System.out.println(maxVal);
            for(int j=0; j<m; j++){
                if(matrix[i][j]==-1){
                    ans[i][j]=maxVal;
                }
            }
        }
        return ans;
    }
}
