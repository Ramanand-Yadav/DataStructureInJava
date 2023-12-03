package SlidingWindowTwoPointer.MediumProblems;

import java.util.LinkedList;

public class longestones {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(arr, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int i=0; int j=0; 
        int n = nums.length;
        int ans = 0;
        LinkedList<Integer> al = new LinkedList<>();
        while (i<n && j<n) {
            if(nums[j]==0){
                al.addLast(j);
                if(k>0){
                    k--; 
                }else{
                    i = al.removeFirst()+1;
                    // k++;
                }
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}
