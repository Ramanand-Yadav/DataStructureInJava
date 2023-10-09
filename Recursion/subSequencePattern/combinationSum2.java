package Recursion.subSequencePattern;
import java.util.*;

public class combinationSum2 {
    public static void main(String[] args) {
        int[]arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> ans = combinationSum21(arr, target);
        for(List<Integer> al : ans){
            System.out.println(al);
        }
    }
    public static List<List<Integer>> combinationSum21(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        int n = candidates.length;
        sovle(candidates, target, ans, new ArrayList<>(), n, 0);
        return ans;
    }
    public static void sovle(int[] arr, int t, List<List<Integer>>ans, List<Integer>al, int n, int ind){
        if(t==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=ind; i<arr.length; i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>t)break;
            al.add(arr[i]);
            sovle(arr, t-arr[i], ans, al, n, i+1);
            al.remove(al.size()-1);
        }
    }
}

