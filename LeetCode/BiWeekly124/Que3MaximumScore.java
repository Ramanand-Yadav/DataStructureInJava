package LeetCode.BiWeekly124;

public class Que3MaximumScore {
    static Integer dp[][];
    public static void main(String[] args) {
        
    }
    
    public static int solve(int nums[],int i,int j,int score){
        if(j-i+1<2) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int ans=0;
        if(nums[i]+nums[i+1]==score) ans=Math.max(ans,1+solve(nums,i+2,j,score));
        if(nums[i]+nums[j]==score) ans=Math.max(ans,1+solve(nums,i+1,j-1,score));
        if(nums[j]+nums[j-1]==score) ans=Math.max(ans,1+solve(nums,i,j-2,score));
        return dp[i][j]=ans;
    }
    public static int maxOperations(int[] nums) {
        int max=0;
        dp=new Integer[nums.length][nums.length];
        max=Math.max(max,solve(nums,0,nums.length-1,nums[0]+nums[1]));
        dp=new Integer[nums.length][nums.length];
        max=Math.max(max,solve(nums,0,nums.length-1,nums[nums.length-1]+nums[nums.length-2]));
        dp=new Integer[nums.length][nums.length];
        max=Math.max(max,solve(nums,0,nums.length-1,nums[0]+nums[nums.length-1]));
      return max;
    }
}
