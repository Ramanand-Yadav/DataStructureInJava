package Recursion.GetHandsOn;

import java.util.*;

public class subset {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> al = subsets(nums);
        for(List<Integer> al1 : al){
            for(int val : al1){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        // List<Integer> al = new ArrayList<>(); 
        makeSet(0, n, nums, ans,new ArrayList<>());
        return ans;
    }
    private static void makeSet(int ind, int n, int[] nums, List<List<Integer>>ans, List<Integer>al){
        if(ind>=n){
            ans.add(new ArrayList<>(al));
            return;
        }
        makeSet(ind+1, n, nums, ans, al);
        al.add(nums[ind]);
        makeSet(ind+1, n, nums, ans, al);
        al.remove(al.size()-1);
    }
    
}
