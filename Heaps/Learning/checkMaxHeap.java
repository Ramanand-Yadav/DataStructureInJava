package Heaps.Learning;

public class checkMaxHeap {
    public static void main(String[] args) {
        int[] ans = {3, 2, 4,54, 1, 6,9};
        System.out.println(heapChecker(ans, 0, ans.length));
    }
    public static boolean heapChecker(int nums[], int i, int n){
        if(i>=(n-1)/2)return true;
        int left = i*2+1;
        int right = i*2+2;
        
        if(nums[i]<nums[left] && nums[i]<nums[right] && heapChecker(nums, right, n) && heapChecker(nums, left, n)){
            return true;
        }
        return false;
    }
}
