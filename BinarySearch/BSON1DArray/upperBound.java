package BinarySearch.BSON1DArray;

public class upperBound {
    public static void main(String[] args) {
        
    }
    /* 
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int low = 0;
        int right = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=right){
            int mid = (low+right)/2;
            if(arr[mid]>x){
                ans = Math.min(ans, mid);
                right = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(ans==Integer.MAX_VALUE) return arr.length;
        return ans;
    }
    public static int upperBound1(int []arr, int x, int n){
        // Write your code here.
        for(int i=0; i<n; i++){
            if(arr[i]>x) return i;
        }
        return arr.length;
    }
    */
}
