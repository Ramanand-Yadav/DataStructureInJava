package Recursion.subSequencePattern;

import java.util.*;

public class subarraySumK {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,1};
        int m = 3; 
        subarraysWithSumK(arr, m);
    }
    public static List< List < Integer > > subarraysWithSumK1(int []a, long m) {
        int i=0; int j=0; 
        long sum=0;
        List<List<Integer>> ans = new ArrayList<>();

        while(i<a.length){
            if(sum==m){
                for(int k=j; k<=i; k++){

                }
            }
        }
        return ans;
    }
    public static List< List < Integer > > subarraysWithSumK(int []a, long m) {
        // Write your code here
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=a.length-1; i>=0; i--){
            long sum = 0;
            List<Integer> al = new ArrayList<>();
            for(int j=i; j<a.length; j++){
                sum+=a[j];
                al.add(a[j]);
                if(sum==m){
                    ans.add(new ArrayList<Integer>(al));
                    break;
                }
            }
        }
        for(List<Integer> al1 : ans){
            System.out.println(al1);
        }
        return ans;
    }
}
