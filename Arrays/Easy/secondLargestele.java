package Arrays.Easy;

import java.util.Arrays;

public class secondLargestele {
    public static void main(String[] args) {
        int[] arr = getSecondOrderElements(8, new int[]{4,6,2,5,7,9,1,3});
        for(int i: arr){
            System.out.println(i);
        }
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        int[] arr ={a[n-2],a[1]};
        return arr;
    }
    
}
