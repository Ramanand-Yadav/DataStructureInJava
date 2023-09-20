package Arrays.Medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class maxconsecutive {
    public static void main(String[] args) {
        // int[] arr = {0,3,7,2,5,8,4,6,0,1};
        int[] arr = {100,4,200,1,3,2};
        int val = longestConsecutive(arr);
        System.out.println(val);
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums ) set.add(i);
        int ans = 0;
        for(int i : nums ){

            int max=1,preVal=i-1,nextVal=i+1;
            while(set.contains(preVal)){
                max++;
                set.remove(preVal);
                preVal--;
            }
            
            while(set.contains(nextVal)){
                max++;
                set.remove(nextVal);
                nextVal++;
            }
            
            ans = Math.max(ans, max);
        }
        return ans;
    }
    private static int solve(int[] arr){
        int ans = 0;
        List<Integer> al=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(al.contains(arr[i])){
                continue;
            }else{
                al.add(arr[i]);
            }
        }
        Collections.sort(al);
        int j=0;
        int i=0;
        for(; i<al.size()-1; i++){
            if(al.get(i)+1==al.get(i+1)){
                continue;
            }else{
                ans = Math.max(ans, i-j+1);
                j = i+1;
            }
        }
        ans = Math.max(ans, i-j+1);
        return ans;
    }
/* 
    private static int longestConsecutive(int[] nums) {
        int n = nums.length;
        int lastElement = Integer.MIN_VALUE;
        int longest =1;
        int cnt = 0;
        if(n==0) return 0;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(nums[i]-1==lastElement){
                cnt+=1;
                lastElement = nums[i];
            }else if(lastElement!=nums[i]){
                cnt = 1;
                lastElement = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
    */
}
