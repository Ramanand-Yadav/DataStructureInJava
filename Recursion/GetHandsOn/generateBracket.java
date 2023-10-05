package Recursion.GetHandsOn;

import java.util.*;
// import java.util.List;

public class generateBracket {
    public static void main(String[] args) {
        
    }
    public static ArrayList<String> validParenthesis(int n){
        // Write your code here.
        ArrayList<String> ans = new ArrayList<>();
        backtrack("", 0, 0, ans, n);
        return ans;
    } 
    private static void backtrack(String s, int open, int close, List<String> ans, int n){
        if(open==n && close==n){
            ans.add(s);
        }
        if(open<n){
            backtrack(s+"(", open+1, close, ans, n);
        }
        if(close<open){
            backtrack(s+")", open, close+1, ans, n);
        }
    }
}
