package Recursion.subSequencePattern;

import java.util.*;

public class combinationSum {
    public static void main(String[] args) {
        int[] arr = {13, 3, 2, 17};
        int target = 14;
        List<List<Integer>> ans = combinationSum1(arr, target);
        for(List<Integer> al : ans){
            System.out.println(al);
        }
    }
    public static List<List<Integer>> combinationSum1(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
    public static void solve(int ind, int[] arr, int t, List<Integer>al, List<List<Integer>>ans){
        if(t==0){
            List<Integer> al1 = new ArrayList<>();
            al1.addAll(al);
            ans.add(al1);
            return;
        }
        if(ind>=arr.length || t<0){
            return;
        }
        solve(ind+1, arr, t, al, ans);  
        al.add(arr[ind]);
        solve(ind, arr, t-arr[ind],al, ans);  
        al.remove(al.size()-1);                              
    }
}
