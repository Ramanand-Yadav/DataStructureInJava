package Recursion.subSequencePattern;

import java.util.*;


public class letterCombinations {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            Map<Integer,String>mp = new HashMap<Integer,String>();
            mp.put(2,"abc");mp.put(3,"def");mp.put(4,"ghi");mp.put(5,"jkl");mp.put(6,"mno");mp.put(7,"pqrs");mp.put(8,"tuv");mp.put(9,"wxyz");
            List<String> ans = new ArrayList<>();
            System.out.println("Enter Digits : ");
            String str = scn.next();
            solve(ans,str,mp,0,str.length(),"");
            for(String val : ans){
                System.out.println(val);
            }
        }
    }
    
    public static List<String> letterCombinations1(String digits) {
        Map<Integer,String>mp = new HashMap<Integer,String>();
        mp.put(2,"abc");mp.put(3,"def");mp.put(4,"ghi");mp.put(5,"jkl");mp.put(6,"mno");mp.put(7,"pqrs");mp.put(8,"tuv");mp.put(9,"wxyz");
        List<String> ans = new ArrayList<>();
        solve(ans,digits,mp,0,digits.length(),"");
        return ans;
    }
    public static void solve(List<String>ans, String digits, Map<Integer,String>mp, int ind, int n,String temp){
        if(ind==n){
            ans.add(temp);
            return;
        }
        int val = digits.charAt(ind)-'0';
        String dstr = mp.get(val);
        for(int i=0; i<dstr.length(); i++){
            solve(ans, digits, mp, ind+1, n, temp+dstr.charAt(i));
        }
    }
}
