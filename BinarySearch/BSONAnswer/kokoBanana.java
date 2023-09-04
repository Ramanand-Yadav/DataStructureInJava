package BinarySearch.BSONAnswer;

public class kokoBanana {
    public static void main(String[] args) {
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxEle = piles[0];
        int n = piles.length;
        for(int i=0; i<n; i++){
            if(piles[i]>maxEle) maxEle = piles[i];
        }

        int ans = Integer.MAX_VALUE;
        // int total = 0;
        for(int i=1; i<=maxEle; i++){
            int total = 0;
            for(int j=0; j<n;j++){
                total += Math.ceil((double)piles[j]/(double)i);
            }
            if(total<=h){
                return i;
            }
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxEle = piles[0];
        int n = piles.length;
        for(int i=0; i<n; i++){
            if(piles[i]>maxEle) maxEle = piles[i];
        }

        // int ans = Integer.MAX_VALUE;
        // int total = 0;
        int l = 1; int r = maxEle; 
        while(l<=r){
            int mid = (l+r)/2;
            int total = calculate(piles, mid);
            if(total<=h){
                // ans = Math.min(total, ans);
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
    private int calculate(int[] arr, int val){
        int t = 0;
        for(int i=0; i<arr.length; i++){
            t += Math.ceil((double)arr[i]/(double)val);
        }
        return t;
    }
}
