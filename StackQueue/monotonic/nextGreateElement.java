package StackQueue.monotonic;

import java.util.*;

public class nextGreateElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2}; 
        int[] nums2 = {1,3,4,2};
        int[] ans = nextGreateElement1(nums1,nums2);
        for(int val : ans){
            System.out.print(val+" ");
        }
    }
    public static int[] nextGreateElement1(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int[] arr = new int[nums2.length];
        arr[nums2.length-1] = -1;
        Map<Integer,Integer>mp = new HashMap<>();
        mp.put(nums2[nums2.length-1], nums2.length-1);
        Stack<Integer>st = new Stack<>();
        st.push(nums2[nums2.length-1]);
        for(int i=nums2.length-2; i>=0; i--){
            int val = nums2[i];
            mp.put(val, i);
            while(!st.isEmpty() && val>st.peek()){
                st.pop();
            }
            if(st.size()==0){
                arr[i]=-1;
            }else{
                arr[i]=st.peek();
            }
            st.push(val);
        }
        for(int i=0; i<nums1.length; i++){
            int val = nums1[i];
            ans[i]=arr[mp.get(val)];
        }
        return ans;
    }
}
