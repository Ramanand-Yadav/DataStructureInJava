package Arrays.Hard;

// import java.util.*;

public class sum4 {
    public static void main(String[] args) {
        
    }
/* 
    private static List<List<Integer>> optimal(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<n; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int k = j+1;
                int l = n-1;

                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }

    public List<List<Integer>> BetterApproach(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                Set<Long> hset = new HashSet<>();
                for(int k=j+1;k<n;k++){

                    // for(int l=k+1;l<n;l++){
                        long sum = nums[i]+nums[j];
                        sum += nums[k];
                        long l = target-sum;
                        if(hset.contains(l)){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add((int) l);
                            temp.sort(Integer::compareTo);
                            set.add(temp);
                        }else{
                            hset.add((long) nums[k]);
                        }
                    // }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
    */
}
