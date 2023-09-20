package BinarySearch.BSON1DArray;

public class minEleRotatedSorted {
    public static void main(String[] args) {
        
    }
    public static int findMin(int []nums) {
        // Write your code here.
        int ans = Integer.MAX_VALUE;
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            ans = Math.min(ans, nums[mid]);
            if(nums[l]<=nums[mid]){
                ans = Math.min(ans, nums[l]);
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }
    public static int findMin1(int[] nums) {
        // return 1;
        int ans = Integer.MAX_VALUE;
        // for(int i=0; i<nums.length;i++){
        //     if(ans>nums[i]){
        //         ans = nums[i];
        //     }
        // }
        // return ans;
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[l]<=nums[r]){
                ans = Math.min(nums[l], ans);
                break;
            }
            if(nums[l]<=nums[mid]){
                ans = Math.min(ans, nums[l]);
                l = mid+1;
            }else{
                ans = Math.min(ans, nums[mid]);
                r = mid-1;
            }
        }
        return ans;
    }
}
