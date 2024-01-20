package LeetCode.Biweekly122;

public class question {
    public static void main(String[] args) {
        // System.out.println("Ram");
        int [] nums = {1,6,49,35,41,4,31,39,36,39};
        System.out.println(minimumCost(nums));
    }
    public static int minimumCost(int[] nums) {
        int minSum = Integer.MAX_VALUE;
        int n =nums.length;
        for(int i=0; i<n-2; i++){
            int sum = nums[0]+nums[i+1];
            for(int j=i+1; j<n-1; j++){
                sum+=nums[j+1];
                // System.out.println(nums[0]+"+"+nums[i+1]+"+"+nums[j+1]+"="+sum);
                minSum = Math.min(minSum, sum);
                sum-=nums[j+1];
            }
        }
        return minSum;
    }
}
