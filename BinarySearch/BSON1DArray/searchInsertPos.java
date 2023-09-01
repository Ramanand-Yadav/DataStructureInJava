package BinarySearch.BSON1DArray;

public class searchInsertPos {
    public static void main(String[] args) {
        
    }

    public int searchInsert(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==target){
        //         return i;
        //     }else if(nums[i]>target){
        //         return i;
        //     }
        // }
        // return nums.length;

        int left = 0;
        int right = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                ans = mid;
                return ans;
            }else if(nums[mid]>target){
                ans = Math.min(ans, mid);
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(ans==Integer.MAX_VALUE) return nums.length;
        return ans;
    }
}
