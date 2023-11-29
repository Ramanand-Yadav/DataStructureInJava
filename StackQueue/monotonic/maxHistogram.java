package StackQueue.monotonic;

import java.util.Stack;

public class maxHistogram {
    public static void main(String[] args) {
        int[] arr = {2, 4};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[heights.length];
        int[] right = new int[n];
        left[0]=0;
        right[n-1]=n-1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1; i<n; i++){
            while (!st.isEmpty() && heights[st.peek()]>=heights[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=0;
            }else{
                left[i]=st.peek()+1;
            }
            st.push(i);
        }
        st.clear();
        st.push(n-1);
        for(int i=n-2; i>=0; i--){
            while (!st.isEmpty() && heights[st.peek()]>=heights[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=n-1;
            }else{
                right[i]=st.peek()-1;
            }
            st.push(i);
        }
        // System.out.println("left");
        // for(int val : left){
        //     System.out.print(val+" ");
        // }
        // System.out.println("right");
        // for(int val : right){
        //     System.out.print(val+" ");
        // }
        int ans = 0;
        for(int i=0; i<n; i++){
            int val = heights[i]*(Math.abs(left[i]-right[i])+1);
            if(ans<val)ans=val;
        }
        return ans;
    }
}
