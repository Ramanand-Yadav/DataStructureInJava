package StackQueue.Monotonic;

import java.util.Scanner;
import java.util.Stack;

public class postfixToPrefix {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter a postfix Expression : ");
            String exp = scn.nextLine();
            System.out.println(postfixToPrefix1(exp));  
        };
    }
    public static String postfixToPrefix1(String exp) {
        // Write your code here
        Stack<String> st = new Stack<>();
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch))st.push(ch+"");
            else{
                String v1 = st.pop();
                String ans = ch+st.pop()+v1;
                st.push(ans);
            }
        }
        return st.peek();
    }
}
