package StackQueue.monotonic;

public class subarrayRange {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        int ans = rangeSum(arr);
        System.out.println(ans);
    }
    public static int rangeSum(int []nums){
        // Write your code here.
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int mine = nums[i];
            int maxe = nums[i];
            ans += maxe-mine;
            for(int j=i+1; j<nums.length; j++){
                if(mine>nums[j]){
                    mine = nums[j];
                }
                if(maxe<nums[j]){
                    maxe = nums[j];
                }
                ans += maxe-mine;
            }
        }
        return ans;
    }
}
