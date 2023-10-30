package Recursion.subSequencePattern;

import java.util.*;

public class GenerateAllBinary {
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = scn.nextInt();
            List<String> ans = new ArrayList<>();
            solve(n,ans, 0,"",false);
            System.out.println("List is : ");
            for(String val : ans){
                System.out.print(val+" ");
            }
        }

    }

    public static void solve(int n, List<String> ans, int ind, String temp, boolean flag){
        if(ind==n){
            ans.add(temp);
            return;
        }
        if(flag==false){
            solve(n, ans,ind+1,temp+"0", false);
            solve(n,ans,ind+1,temp+"1",true);
        }else{
            solve(n, ans,ind+1,temp+"0", false);
        }
    }
}
