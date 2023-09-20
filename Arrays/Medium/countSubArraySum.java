package Arrays.Medium;
import java.util.*;
public class countSubArraySum {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        int preSum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        if(k==0){
            for(int i=0; i<nums.length;i++){
                int sum = 0;
                for(int j=i; j<nums.length; j++){
                    sum+=nums[j];
                    if(sum==k){
                        cnt++;
                    }
                }
            }
            return cnt;
        }
        mp.put(0, 1);
        for(int i=0; i<nums.length; i++){
            preSum += nums[i];
            mp.put(preSum, mp.getOrDefault(preSum,0)+1);
            cnt += mp.getOrDefault(preSum-k,0);
        }
        return cnt;
    }
}
