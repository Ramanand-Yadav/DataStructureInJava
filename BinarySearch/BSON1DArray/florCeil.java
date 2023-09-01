package BinarySearch.BSON1DArray;

import java.util.Arrays;

public class florCeil {
    public static void main(String[] args) {
        
    }
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        int ceil = findCeil(arr, n, x);
        int flor = findFloor(arr, n, x);
        System.out.print(flor+" ");
        return ceil;
        
    }

    private static int findCeil(int[] arr,int n, int x){
        Arrays.sort(arr);
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                ans = arr[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    private static int findFloor(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] <= x) {
                ans = arr[mid];
                //look for smaller index on the left
                low = mid + 1;
            } else {
                high = mid - 1; // look on the right
            }
        }
        return ans;
    }
    
}
