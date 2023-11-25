package StackQueue.monotonic;

import java.util.Stack;

public class nextGreater2 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] ans = nextGreaterElements(arr);
        for(int val : ans){
            System.out.print(val+" ");
        }
    }
    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer>st = new Stack<>();
        for(int i=nums.length-2; i>=0; i--){
            st.push(nums[i]);
        }
        for(int i=nums.length-1; i>=0; i--){
            int val = nums[i];
            while(!st.isEmpty() && val>=st.peek()) {
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(val);
        }
        return ans;
    }
}
