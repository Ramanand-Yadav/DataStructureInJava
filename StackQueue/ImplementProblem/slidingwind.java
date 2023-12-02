package StackQueue.ImplementProblem;

import java.util.*;
public class slidingwind {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maxSlidingWindow(arr, k);
        for(int val : ans){
            System.out.print(val+" ");
        }
    }
    public static int[] maxSlidingWindow(int[] arr, int k) {
        int[] ans = new int[arr.length-k+1];
        LinkedList<Integer>dq = new LinkedList<>();
        int j=0;
        for(int i=0; i<arr.length; i++){
            while (!dq.isEmpty() && arr[dq.getLast()]<=arr[i]) {
                dq.removeLast();
            }
            dq.add(i);
            if(i-j+1==k){
                ans[j]=arr[dq.getFirst()];
                if(j==dq.getFirst()) dq.removeFirst();
                j++;
            }
        }
        return ans;
    }
}
