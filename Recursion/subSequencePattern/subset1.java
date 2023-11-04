package Recursion.subSequencePattern;

import java.util.ArrayList;
import java.util.Collections;

public class subset1 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        subsetSum(arr);
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> al = new ArrayList<>();
        int n = num.length;
        solve(num,n,0,0,al);
        Collections.sort(al);
        return al;
    }
    public static void solve(int[] num, int n, int ind, int sum, ArrayList<Integer>al){
        if(ind==n){
            al.add(sum);
            return;
        }
        solve(num,n,ind+1,sum,al);
        solve(num,n,ind+1,sum+num[ind],al);
    }
}
