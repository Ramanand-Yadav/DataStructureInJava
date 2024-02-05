package LeetCode.weekly381;

public class ques01 {
    public static void main(String[] args) {
        int[] nums = {1,4,8,3,3};
        int k = 4;
        System.out.println(maximumSubarraySum(nums, k));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long pre = nums[0];
        long suf = nums[n-1]; 
        long sum = 0;
        for(int val : nums){
            sum+=val;
        }
        long res = Long.MIN_VALUE;
        if(Math.abs(nums[0]-nums[n-1])==k){
            res = Math.max(res,sum);
        }
        // System.out.println(sum);
        // System.out.println(sum+" "+pre+" "+suf);
        if(n==2){
            if(res == Long.MIN_VALUE)return 0;
            return res;
        }
        //1 2 3 4 5 6
        for(int i=1; i<nums.length-1; i++){
            //left sub arry
            pre+=nums[i];
            if(Math.abs(nums[0]-nums[i])==k){
                res = Math.max(res, pre);
            }
            //right subarray
            suf+=nums[n-i-1];
            if(Math.abs(nums[n-1]-nums[n-i-1])==k){
                res=Math.max(res,suf);
            }
            //midd  subarray
            if(i<(n-i-1)){
                sum-=nums[i-1];
                sum-=nums[n-i];
                if(Math.abs(nums[i]-nums[n-i-1])==k){
                    res = Math.max(res, sum);
                }
            }
            if((i==(n-i-1))){
                // System.out.println(sum);
                sum-=nums[i-1];
                if(Math.abs(nums[i]-nums[i+1])==k){
                    res = Math.max(res,sum);
                }
                // System.out.println(sum);
                sum+=nums[i-1];
                sum-=nums[i+1];
                if(Math.abs(nums[i]-nums[i-1])==k){
                    res=Math.max(res,sum);
                }
                // System.out.println(sum);
                // System.out.println("Ram");
            }
            // System.out.println(sum+" "+pre+" "+suf);
        }
        if(res == Long.MIN_VALUE)return 0;
        return res;
    }
    public static int minimumPushes(String word) {
        int n = word.length();
        if(n<=8)return n;
        else if(n<=16) return (8+(n-8)*2);
        else if(n<=24) return (8+8*2+(n-16)*3);
        else if(n<=26) return (8+8*2+8*3+(n-24)*4);
        return -1;
    }
}
