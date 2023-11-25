package StackQueue.PosrPerInfix;

import java.util.Scanner;
import java.util.Stack;

public class prefixtoinfix {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            
            System.out.println("Enter a Prefix Expression : ");
            String exp = scn.nextLine();
            System.out.println(prefixToInfixConversion(exp));
            
        };
    }
    public static String prefixToInfixConversion(String exp) {
        // Write your code here
        Stack<String>st = new Stack<>();
        for(int i=exp.length()-1; i>=0; i--){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }else{
                String ans = "("+st.pop()+ch+""+st.pop()+")";
                st.push(ans);
            }
        }
        return st.pop();
    }
}
