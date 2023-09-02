package BinarySearch.BSON1DArray;

public class RotatedSortedEle2 {
    public static void main(String[] args) {
        
    }
    public static boolean searchInARotatedSortedArrayII(int []nums, int target) {
        // Write your code here.
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target) return true;
            else if(nums[l]==nums[r] && nums[l]==nums[mid]){
                l = l+1;
                r = r-1;
                continue;
            }
            else if(nums[l]<=nums[mid]){
                if(target>=nums[l] && target<nums[mid]){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[r]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            } 
            
        }
        return false;
    }
}
