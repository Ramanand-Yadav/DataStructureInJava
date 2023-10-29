package Recursion.GetHandsOn;
import java.util.*;

public class sortStackRecursive {
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
            sortStack(st);

            System.out.println("new stack");
            for(int val : st){
                System.out.print(val+" ");
            }
        }
    }
    public static void sortStack(Stack<Integer> st){
        if(st.size()>0){
            int x = st.pop();
            sortStack(st);
            insertInStack(st,x);
        }
    }
    public static void insertInStack(Stack<Integer> st, int x){
        if(st.size()==0) st.push(x);
        else{
            if(st.peek()>x){
                int a = st.pop();
                insertInStack(st, x);
                st.push(a);
            }else{
                st.push(x);
            }
            
        }
    }
}
