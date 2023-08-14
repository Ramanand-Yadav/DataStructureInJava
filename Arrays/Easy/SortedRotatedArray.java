package Arrays.Easy;
import java.util.Arrays;
//Problem link : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class SortedRotatedArray {
    public static void main(String[] args) {
        boolean val = check2(new int[]{2,1,3,4,5});
        System.out.println(val);
    }
    private static boolean check(int[] nums) {
        int cnt = 0;
        int i;
        for(i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                cnt++;
            }
        }
        if(nums[i]>nums[0]){
            cnt++;
        }
        if(cnt>1) return false;
        return true;
    }
    private static boolean check2(int[] nums){
        int[] arr = new int[nums.length];
        Arrays.fill(arr,0);
        int pivot = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                pivot = i+1;
                break;
            }
        }

        int j=0;
        for(int i=pivot; i<nums.length; i++){
            arr[j] = nums[i];
            j++;
        }
        for(int i=0; i<=pivot-1; i++){
            arr[j] = nums[i];
            j++;
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
