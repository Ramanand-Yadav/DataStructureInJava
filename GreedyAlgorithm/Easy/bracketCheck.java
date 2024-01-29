package GreedyAlgorithm.Easy;

// import java.util.*;

public class bracketCheck {
    public static void main(String[] args) {
        String str = "()()**)";
        // System.out.println(checkValidString1(str)+" "+checkValidString1(str));
        System.out.println(str);
    }
}
    /* 
    public static boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                low++;
                high++;
            } else if (s.charAt(i) == ')') {
                if (low > 0) {
                    low--;
                }
                high--;
            } else {
                if (low > 0) {
                    low--;
                }
                high++;
            }
            if (high < 0) {
                return false;
            }
        }
        return low == 0;
    }
    public static boolean checkValidString1(String s) {
        Stack<Integer>st1 = new Stack<>(); 
        Stack<Integer>st2 = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i); 
            if(ch=='(')st1.push(i);
            else if(ch==')'){
                if(!st1.isEmpty())st1.pop();
                else if(!st2.isEmpty())st2.pop();
                else return false;
            }else{
                st2.push(i);
            }
        }
        while(!st1.isEmpty()){
            int ind = st1.pop();
            if(st2.isEmpty())return false;
            int ind2 = st2.pop();
            if(ind2<ind)return false;
        }
        return true;
    }
*/
