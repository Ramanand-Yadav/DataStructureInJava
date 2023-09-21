package BinarySearch.BSONAnswer;

public class findSmallestDivisor {
    public static void main(String[] args) {
        
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int maxe = Integer.MIN_VALUE;
        // int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            maxe = Math.max(nums[i], maxe);
        }

        // for(int i=1; i<=maxe; i++){
        //     int t = 0;
        //     for(int j=0; j<nums.length; j++){
        //         t += Math.ceil((double)nums[j]/(double)i);
        //     }
        //     // System.out.println(t+" "+i+" ");

        //     if(threshold>=t){
        //         return i;
        //     }
        // }
        int l = 1; int r = maxe;
        while(l<=r){
            int mid = (l+r)/2;
            int val = cal(nums, mid);
            if(threshold>=val){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
    private int cal(int[] arr, int v){
        int t = 0;
        for(int i=0; i<arr.length; i++){
            t += Math.ceil((double)arr[i]/(double) v);
        }
        return t;
    }
}
