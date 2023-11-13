package BitManipulation.interviewProblem;

import java.util.*;


public class powerSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>>ans = subsets(arr);
        for(List<Integer>al : ans){
            System.out.println(al);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        int num = (int)Math.pow(2, nums.length);
        for(int i=0; i<num; i++){
            List<Integer> al = new ArrayList<>();
            for(int j=0; j<nums.length; j++){
                int val = ((1<<j)&i)>0?1:0;
                if(val==1){
                    al.add(nums[j]);
                }
            }
            ans.add(new ArrayList<>(al));
        }
        return ans;
    }
}
