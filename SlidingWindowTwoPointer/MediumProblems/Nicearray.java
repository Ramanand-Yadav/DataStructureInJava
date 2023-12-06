package SlidingWindowTwoPointer.MediumProblems;
// import java.util.*;
public class Nicearray {
    public static void main(String[] args) {
        
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        return (countValue(nums,k)-(countValue(nums, k-1)));
    }
    public static int countValue(int[] nums, int k){
        int cnt = 0; 
        int res = 0; 
        int l = 0; 
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==1){
                cnt++;
            }
            while(cnt>k){
                if(nums[l]%2==1){
                    cnt--; 
                }
                l++; 
            }
            res+= i-l+1;
        }
        return res;
    }
}
