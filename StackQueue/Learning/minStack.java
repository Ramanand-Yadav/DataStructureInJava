package StackQueue.Learning;

import java.util.Stack;

public class minStack {
    static class MinStack {
        Stack<Integer>st;
        int min;
        public MinStack() {
            st = new Stack<>();
            min = Integer.MAX_VALUE;
        }
        
        public void push(int val) {
            if(val<=min){
                st.push(min);
                min = val;  
            }
            st.push(val);
        }
        
        public void pop() {
            int val = st.pop();
            if(val==min){
                min = st.pop();
            }
        }
        
        public int top() {
            return st.peek();
        }
        
        public int getMin() {
            return min;
        }
    }
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(2);
        stack.push(8);
        stack.push(-3);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();;
        System.err.println(stack.getMin());
    }
}
