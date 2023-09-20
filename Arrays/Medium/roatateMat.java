package Arrays.Medium;
public class roatateMat {
    public static void main(String[] args) {
    
    }
    public static void rotateMatrix(int [][]matrix){
        // Write your code here.
        int n = matrix.length; 
        // print(matrix);
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // System.out.println();
        // print(matrix);
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
            // reverse(matrix,0,n-1,i);
        }
    }
    
}
