package SlidingWindowTwoPointer.MediumProblems;
import java.util.*;
public class binarySubArray {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(arr, goal));
        int t1 = solve(arr, goal);
        int t2 = solve(arr, goal-1);
        System.out.println(t1-t2);
    }
    public static int solve(int[] nums, int goal){
        int sum=0,cnt=0,e=0,s=0;
        while(e<nums.length){
            sum+=nums[e];
            while(sum>goal&&s<nums.length){
                sum-=nums[s];
                s++; 
            }
            if(sum<=goal){
                cnt+=e-s+1;
            }
            e++;
        }
        return cnt;
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int cnt = 0; 
        HashMap<Integer, Integer>mp = new HashMap<>();
        int sum = 0; 
        // int cnt = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i]; 
            if(sum==goal){
                cnt++;
            } 
            cnt+= mp.getOrDefault(sum-goal, 0);
            mp.put(sum, mp.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}
