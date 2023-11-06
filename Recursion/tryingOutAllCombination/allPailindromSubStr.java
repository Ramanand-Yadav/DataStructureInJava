package Recursion.tryingOutAllCombination;

import java.util.*;

public class allPailindromSubStr {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the String :");
            String str = scn.next();
            List<List<String>>ans = partition(str);
            for(List<String>al:ans){
                System.out.println(al);
            }
        }
    }
    public static List<List<String>> partition(String s) {
        List<List<String>>ans = new ArrayList<>();
        solve(0,s,ans,s.length(),new ArrayList<>());
        return ans;
    }
    public static void solve(int curr,String str, List<List<String>>ans, int n,List<String>al){
        if(curr==n){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=curr; i<n; i++){
            if(isPalindrome(str,curr,i)){
                al.add(str.substring(curr,i+1));
                solve(i+1, str, ans, n, al);
                al.remove(al.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String temp, int k, int j){
        while(k<j){
            if(temp.charAt(k)!=temp.charAt(j))return false;
            k++;j--;
        }
        return true;
    }
}
