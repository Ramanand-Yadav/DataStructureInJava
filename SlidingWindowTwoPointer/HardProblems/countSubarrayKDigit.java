package SlidingWindowTwoPointer.HardProblems;

import java.util.HashMap;

public class countSubarrayKDigit {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3}; 
        int k = 2; 
        System.out.println(subarraysWithKDistinct(arr, k));
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k)-atMost(nums, k-1);
    }
    public static int atMost(int[] A, int k){
        int res = 0; 
        int i=0; 
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int j=0; j<A.length; j++){
            if(mp.getOrDefault(A[j], 0)==0)k--; 
            mp.put(A[j],mp.getOrDefault(A[j], 0)+1);
            while(k<0){
                mp.put(A[i], mp.get(A[i])-1);
                if(mp.get(A[i])==0)k++;
                i++;
            }
            res += j-i+1;
        }
        return res;
    }
}
