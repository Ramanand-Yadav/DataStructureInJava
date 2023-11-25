package StackQueue.PosrPerInfix;

import java.util.Scanner;
import java.util.Stack;

public class infixtoPostfix {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String exp = scn.nextLine();
            System.out.println(infixToPostfix(exp));
        }
    }
    public static int Precedence(char ch){
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String exp) {
        // Write your code here
        //(), +, -, *, /, ^
        //()-4, *,/ - 3, -,+ -2, ^ - 1
        Stack<Character> st = new Stack<>();
        String ans = "";
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            //letter or Digit 
            if(Character.isLetterOrDigit(ch)){
                ans += ch;
            }
            //bracket (
            else if(ch=='('){
                st.push(ch);
            }
            //bracket )
            else if(ch==')'){
                while (!st.isEmpty() && st.peek()!='(') {
                    ans += st.pop();
                }
                st.pop();
            }
            //operand 
            else{
                while(!st.isEmpty() && Precedence(ch)<=Precedence(st.peek())){
                    ans += st.pop();
                }
                st.push(ch);
            }  
        }
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }
}
