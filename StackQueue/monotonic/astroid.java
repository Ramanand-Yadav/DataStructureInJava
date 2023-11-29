package StackQueue.monotonic;

import java.util.Stack;

public class astroid {
    public static void main(String[] args) {
        int[] arr = {5,10,-5};
        int[] ans = asteroidCollision(arr);
        for(int val : ans){
            System.out.print(val+" ");
        }
    }
    public static int[] asteroidCollision(int[] arr) {
        System.out.println("fnc calleed");
        Stack<Integer>st = new Stack<>();
        int n = arr.length;
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            st.push(arr[i]);
            while(st.size()>=2){
                int val1 = st.pop();
                int val2 = st.pop();
                if(val1>0&&val2<0){
                    val2 = -1*val2;
                    if(val2>val1){
                        st.push((-1*val2));
                    }else if(val1>val2){
                        st.push(val1);
                    }
                }else if(val1<0&&val2>0){
                    val1 = -1*val1;
                    if(val1>val2){
                        st.push((-1*val1));
                    }else if(val2>val1){
                        st.push(val2);
                    }
                }else{
                    st.push(val2);
                    st.push(val1);
                    break;
                }
            }
        }
        int[] ans = new int[st.size()];
        int i=0; 
        while(!st.isEmpty()){
            ans[i]=st.pop();
            i++;
        }
        return ans;
    }
}
