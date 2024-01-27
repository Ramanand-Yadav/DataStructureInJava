package GreedyAlgorithm.Easy;

import java.util.*;

public class GreedyAlogMinCoin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = 50; 
        helper(n, arr);
    }
    private static List<Integer> helper(int n, int[] arr){
        List<Integer> al = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            while(arr[i]<=n){
                al.add(arr[i]);
                n-=arr[i];
            }
        }
        return al;
    }

}
