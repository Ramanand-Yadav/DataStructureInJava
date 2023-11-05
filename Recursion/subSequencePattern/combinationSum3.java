package Recursion.subSequencePattern;

import java.util.*;

public class combinationSum3 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the Targer sum : ");
            int n = scn.nextInt();
            System.out.println("Enter the count number : ");
            int k = scn.nextInt();
            List<List<Integer>>ans = combinationSum31(k, n);
            for(List<Integer> al : ans){
                System.out.println(al);
            }
        }
    }
    public static List<List<Integer>> combinationSum31(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),0,1,k,n,0);
        return ans;
    }
    public static void solve(List<List<Integer>>ans, List<Integer>al, int ind, int curVal, int k, int n, int sum){
        if(sum==n && ind==k){
            ArrayList<Integer> al2 = new ArrayList<>(al);
            if(!ans.contains(al2)){
                ans.add(new ArrayList<>(al));
            }
            return;
        }
        if(ind>k || curVal>9 || sum>n){
            return;
        }
        al.add(curVal);
        solve(ans, al, ind+1, curVal+1, k, n, sum+curVal);
        al.remove(al.size()-1);
        solve(ans,al,ind,curVal+1,k,n,sum);
    }
}
