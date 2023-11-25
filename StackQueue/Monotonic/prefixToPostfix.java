package StackQueue.Monotonic;

import java.util.Scanner;
import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Enter a prefix Expression : ");
            String exp = scn.nextLine();
            System.out.println(preToPost(exp));  
        };
    }
    public static String preToPost(String s) {
        Stack<String>st = new Stack<>();
        for(int i=s.length()-1; i>=0;i--){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))st.push(ch+"");
            else{
                String ans = st.pop()+st.pop()+ch;
                st.push(ans);
            }
        }
        return st.pop();
    }
}
