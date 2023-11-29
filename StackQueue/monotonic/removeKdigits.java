package StackQueue.monotonic;

import java.util.Stack;

public class removeKdigits {
    public static void main(String[] args) {
        String str = "10200";
        System.out.println(removeKdigits1(str,1));
    }
    public static String removeKdigits1(String num, int k) {
        StringBuilder ans = new StringBuilder();
        Stack<Character>st = new Stack<>();
        if(num.length()==k)return "0";
        int i=0;
        while(i<num.length()){
            char ch = num.charAt(i);
            while(!st.isEmpty() && st.peek()>ch && k>0){
                st.pop();
                k--;
            }
            st.push(ch);
            i++;
        }
        while (k>0) {
            st.pop();
            k--;
        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        ans.reverse();
        while(ans.charAt(0)=='0' && ans.length()>1)ans.deleteCharAt(0);
        return ans.toString();
    }
}
