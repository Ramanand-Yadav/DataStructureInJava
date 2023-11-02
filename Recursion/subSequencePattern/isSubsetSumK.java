package Recursion.subSequencePattern;

public class isSubsetSumK {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,1};
        int k = 6;
        int n = 6;
        isSubsetPresent(n, k, arr);
    }
    public static boolean isSubsetPresent(int n, int k,int []a) {
        // Write your code here
        return solve(n,k,a,0,0);

    }
    public static boolean solve(int n, int k, int[] arr, int sum, int ind){
        if(sum==k)return true;
        if(ind<n && sum+arr[ind]<=k){
            if(solve(n, k, arr, sum+arr[ind], ind+1)||solve(n, k, arr, sum, ind+1))return true;
        }
        if(ind<n && sum+arr[ind]>k){
            if(solve(n, k, arr, sum, ind+1))return true;
        }
        return false;
    }
}
