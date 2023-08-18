package Arrays.Easy;

public class largestSubArray {
    public static void main(String[] args) {
        
    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int ans = 0;
        int st = 0; 
        int i=0;
        int n = a.length;
        long sum = a[0];
        

        while(i<n){
            while(st<=i && sum>k){
                sum-=a[st];
                st++;
            }
            if(sum==k){
                ans = Math.max(ans, i-st+1);
            }
            i++;
            if(i<n) sum+=a[i];
        }
        return ans;
    }
}
