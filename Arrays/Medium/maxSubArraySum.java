package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class maxSubArraySum{
    public static void main(String[] args) {
        
    }
    public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int maxLen = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum==k){
                maxLen = Math.max(maxLen, i+1);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
            if(mp.containsKey(sum-k)){
                maxLen = Math.max(maxLen, i-mp.get(sum-k));
            }

        }
        return maxLen;
    
	}
}