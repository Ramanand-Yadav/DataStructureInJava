package StackQueue.monotonic;

public class trapWater {
    public static void main(String[] args) {
        
    }
    public static long getTrappedWater(long []arr, int n) {
        // Write your code here.
        long ans = 0;
        
        if(n==0||n==1||n==2)return ans;
        long[] maxl = new long[n];
        long[] maxr = new long[n];
        long[] width = new long[n];
        maxl[0]=arr[0];
        maxr[n-1]=arr[n-1];
        for(int i=1; i<n; i++){
            maxl[i] = Math.max(maxl[i-1], arr[i]);
        }
        for(int i=n-2; i>=0; i--){
            maxr[i] = Math.max(maxr[i+1], arr[i]);
        }
        for(int i=0; i<n; i++){
            width[i] = Math.min(maxl[i], maxr[i])-arr[i];
            ans += width[i];
        }
        
        return ans;
    }
}
