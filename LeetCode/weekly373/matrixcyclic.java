/* 
import java.util.Scanner;

public class matrixcyclic{
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            System.out.print("rows in matrix : ");
            int m = scn.nextInt();
            System.out.print("Column in the matrix : ");
            int n = scn.nextInt();
            int[][] mat = new int[m][n];
            System.out.println("Enter "+m+" X "+n+" values in matrix");
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    mat[i][j]=scn.nextInt();
                }
            }
            System.out.print("Value to Rotate the matrix :" );
            int k = scn.nextInt();
            boolean ans = areSimilar(mat, k);
            System.out.println("Rotation Result is : "+ans);
        };
    }
    public static boolean areSimilar(int[][] mat, int k) {
        int m = mat.length; 
        int n = mat[0].length; 
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=mat[i][j];
            }
        }

        k = k%n;
        
        //for even rows : left shift
        int[] elem = new int[k];
        for(int row=0; row<m; row=row+2){
            for(int i=0; i<k; i++){
                elem[i]=mat[row][i];
            }
            int j=k;
            int eind = 0;
            for(int i=0; i<n; i++){
                if(j<n){
                    mat[row][i]=mat[row][j];
                    j++;
                }else{
                    mat[row][i]=elem[eind];
                    eind++;
                }
            }
        }
        //for odd row : right shift
        // System.out.println("val or k is : "+k);
        int[] oelem = new int[k];
        int j = 0;
        for(int row=1; row<m; row=row+2){
            j = 0;
            for(int i=n-k; i<n; i=i+1){
                System.out.print(" i:"+i+" k:"+k+" j:"+j);
                oelem[j]=mat[row][i];
                j=j+1;
            }
            int lind = k-1;
            int rkind = n-k-1;
            for(int i=n-1; i>=0; i--){
                if(rkind>=0){
                    mat[row][i]=mat[row][rkind];
                    rkind--;
                }else{
                    mat[row][i]=oelem[lind];
                    lind--;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(j=0;j<n; j++){
                if(mat[i][j]!=arr[i][j])return false;
            }
        }
        return true;
    }
}
*/