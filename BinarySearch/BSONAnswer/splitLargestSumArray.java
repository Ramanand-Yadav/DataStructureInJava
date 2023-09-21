package BinarySearch.BSONAnswer;



public class splitLargestSumArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        int ans = solve(arr, k);
        System.out.println("ans = "+ans);
    }
    private static int solve(int[] arr, int k){
        // Arrays.sort(arr);
        int n = arr.length;
        int l = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            l = Math.max(l, arr[i]);
        }
        int r = sum;
        //1st Approach
        /*
        for(int minsum = l; minsum<=r; minsum++){
            int subarray = cntSubArray(arr, minsum, n);
            if(subarray==k){
                return minsum;
            }
        }
        return l;
        */

        //2nd Approach
        while(l<=r){
            int mid = (l+r)/2;
            int cnt = cntSubArray(arr, mid, n);
            if(cnt<=k){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }

    private static int cntSubArray(int[] arr, int min, int n){
        int cnt = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]<=min){
                sum+=arr[i];
            }else{
                sum = arr[i];
                cnt++;
            }
        }
        return cnt;
    }
    
}
