package BinarySearch.BSON1DArray;

public class lowerBound {
    public static void main(String[] args) {
        
    }
/* 
    private static int binarySearch(int[] arr, int low, int high, int x, int ans){
        if(low>high){
            if(ans==Integer.MAX_VALUE){
                ans = arr.length;
                return ans;
            }else return ans;
        }

        int mid = (low+high)/2;
        if(arr[mid]>=x){ 
            ans = Math.min(ans, mid);
            int t = binarySearch(arr, low, mid-1, x, ans);
            ans = Math.min(ans, t);
        }else{
            int t2 = binarySearch(arr, mid+1, high, x, ans);
            ans = Math.min(ans, t2);
        }
        return ans;
        
    }

    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=x){
                return i;
            }
        }
        return arr.length;
    }

    public static int lowerBound1(int []arr, int n, int x) {
        // Write your code here
        int low = 0;
        int right = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=right){
            int mid = (low+right)/2;
            if(arr[mid]>=x){
                ans = Math.min(ans, mid);
                right = mid-1;
            }else{
                low = mid+1;
            }
        }
        if(ans == Integer.MAX_VALUE) return arr.length;
        else return ans;
    }
    */
}
