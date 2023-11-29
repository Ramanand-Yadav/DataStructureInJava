package StackQueue.monotonic;

import java.util.Stack;

public class subarrayRange {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5};
        int ans = rangeSum(arr);
        System.out.println(ans);
        System.out.println(rangeSum1(arr));
    }
    public static int rangeSum(int []nums){
        // Write your code here.
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            int mine = nums[i];
            int maxe = nums[i];
            ans += maxe-mine;
            for(int j=i+1; j<nums.length; j++){
                if(mine>nums[j]){
                    mine = nums[j];
                }
                if(maxe<nums[j]){
                    maxe = nums[j];
                }
                ans += maxe-mine;
            }
        }
        return ans;
    }
    public static int rangeSum1(int []nums){
        // Write your code here.
        int n=nums.length,ans=0,j=0,k=0;
        Stack<Integer> st=new Stack<>();
        //for the first loop we are calculating the summation of min elements of all the subarrays
        for(int i=0;i<=n;i++){
         while(!st.isEmpty() && nums[st.peek()]>(i==n?Integer.MIN_VALUE: nums[i])){
          j=st.pop();
          k=st.isEmpty()?-1:st.peek();
          ans-=nums[j]*(i-j)*(j-k); //here we are calculating product of the element value, the width of the subarray, and the difference in heights (number of elements greater than the popped element).
         }
         st.push(i);
        }
        st.clear();
//here we are calculating summation of all max elements 
        for(int i=0;i<=n;i++){
         while(!st.isEmpty() && nums[st.peek()]<(i==n?Integer.MAX_VALUE: nums[i])){
          j=st.pop();
          k=st.isEmpty()?-1:st.peek();
          ans+=nums[j]*(i-j)*(j-k);
         }
         st.push(i);
        }
        return ans;
    }
}
