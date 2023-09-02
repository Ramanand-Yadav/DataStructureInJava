package BinarySearch.BSON1DArray;

public class findPeakEle {
    public static void main(String[] args) {
        
    }
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        // for(int i=0; i<nums.length;i++){
        //     if((i==0 || nums[i]>nums[i-1]) && (i==n-1 || nums[i]>nums[i+1])){
        //         return i;
        //     }
        // }
        // return 0;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int l=1,r=n-2;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid] > nums[mid-1]){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
}
