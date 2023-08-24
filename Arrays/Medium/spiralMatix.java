import java.util.ArrayList;
import java.util.List;

public class spiralMatix {
    public static void main(String[] args) {
        
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int r1=0,c2=matrix[0].length-1,r2=matrix.length-1,c1=0;
        List<Integer> al = new ArrayList<>();

        while(r1<=r2 && c1<=c2){
        //up
            for(int i=c1;i<=c2;i++){
                al.add(matrix[r1][i]);
            }
            r1++;

            //right
            for(int i=r1; i<=r2; i++){
                al.add(matrix[i][c2]);
            }
            c2--;

            //down
            if(r1<=r2){
                for(int i=c2; i>=c1; i--){
                    al.add(matrix[r2][i]);
                }
                r2--;
            }

            //left
            if(c1<=c2){
                for(int i=r2; i>=r1; i--){
                    al.add(matrix[i][c1]);
                }
                c1++;
            }
        }
        return al;

    }
}
