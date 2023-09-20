package Arrays.Hard;

import java.util.*;

public class sum3 {
    public static void main(String[] args) {
        // setChecking();
    }
    private static List<List<Integer>> BruteForce(int[] nums) {
        Set<List<Integer>> al = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                    for(int k=j+1;k<n;k++){
                            if((nums[i]+nums[j]+nums[k])==0){
                                List<Integer> al1 = Arrays.asList(nums[i],nums[j],nums[k]);
                                al1.sort(null);
                                al.add(al1);
                            }
                    }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(al);
        return ans;
    }

    private static List<List<Integer>> BetterApproach(int[] nums) {
        Set<List<Integer>> al = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            Set<Integer>hSet = new HashSet<>();
            for(int j=i+1;j<n;j++){
                    int k = -(nums[i]+nums[j]);
                    if(hSet.contains(k)){
                        List<Integer> al1 = Arrays.asList(nums[i], nums[j], k);
                        al1.sort(null);
                        al.add(al1);
                    }else{
                        hSet.add(nums[j]);
                    }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(al);
        return ans;
    }
/* 
    private static List<List<Integer>> optimal(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length; 
        for(int i=0; i<n; i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;

            int j= i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> al1 = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(al1);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
    */
    
}
