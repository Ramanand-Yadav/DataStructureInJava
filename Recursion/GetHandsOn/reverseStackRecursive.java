package Recursion.GetHandsOn;

import java.util.*;

public class reverseStackRecursive {
  
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter size of Stack : ");
            int n = scn.nextInt();
            Stack<Integer> st = new Stack<>();
            System.out.println("Enter "+n+" number in stack");
            for(int i=0;i<n;i++){
                st.push(scn.nextInt());
            }
            System.out.println("old stack");
            for(int val : st){
                System.out.print(val+" ");
            }

            // System.out.println(st.pop());
            // Stack<Integer> st1 = new Stack<>();
            // reverseStack(st,n,0, st1);
            // System.out.println("new stack");
            // for(int val : st1){
            //     System.out.print(val+" ");
            // }
            // System.out.println(st1.pop());
            reverseStack1(st);
            System.out.println("new stack");
            for(int val : st){
                System.out.print(val+" ");
            }
        }
    }
    public static void reverseStack(Stack<Integer> st, int n, int ind, Stack<Integer>st1){
        if(ind==n) return;
        
        reverseStack(st, n, ind+1, st1);
        int x = st.pop();
        st1.push(x);
    }
    public static void reverseStack1(Stack<Integer> st){
        if(st.size()>0){
            int x=st.peek();
            st.pop();
            reverseStack1(st);
            insertAtBottom(st, x);
        }
    }
    public static void insertAtBottom(Stack<Integer> st, int a ){
        if(st.size()==0){
            st.push(a);
        }else{
            int x = st.peek();
            st.pop();
            insertAtBottom(st, a);
            st.push(x);
        }
    }
}
