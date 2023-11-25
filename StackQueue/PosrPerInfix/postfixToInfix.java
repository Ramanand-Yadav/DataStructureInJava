package StackQueue.PosrPerInfix;

import java.util.*;

public class postfixToInfix {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter a postfix Expression : ");
            String exp = scn.nextLine();
            System.out.println(postToInfix(exp));  
        };
    }
    public static String postToInfix(String postfix) {
        // Write your code here.
        Stack<String> st = new Stack<>();
        for(int i=0; i<postfix.length();i++){
            char ch = postfix.charAt(i);
            if(Character.isLetterOrDigit(ch))st.push(ch+"");
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                String ans = "("+v2+ch+""+v1+")";
                st.push(ans);
            }
        }
        return st.peek();
    }
}
