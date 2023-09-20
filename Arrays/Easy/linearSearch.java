package Arrays.Easy;

public class linearSearch {
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        linearSearch1(4, 7, arr);
    }
    public static int linearSearch1(int n, int num, int []arr){
        // Write your code here.
        for(int i=0; i<n; i++){
            if(arr[i]==num) return i;
        }
        return -1;
    }
    
}
