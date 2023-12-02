package StackQueue.ImplementProblem;
import java.util.*;
public class stockSpan {
    class Pair{
        int price;
        int ind;
        Pair(int price, int ind){
            this.price = price;
            this.ind = ind;
        }
    }
    class StockSpanner{
        int time=0;
        Stack<Pair>st;
        public StockSpanner(){
            st = new Stack<>();
            st.push(new Pair(1000000,-1));
        }
        public int next(int price){
            Pair p = new Pair(price, time++);
            while(!st.isEmpty() && st.peek().price<=price) st.pop();
            int ans = p.ind-st.peek().ind;
            st.push(p);
            return ans;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,2,4};
        int[] ans = findStockSpans(arr);
        System.out.println();
        for(int val : ans){
            System.out.print(val+" ");
        }
    }
    public static int[] findStockSpans(int []prices) {
        // Write your code here.
        int[] ans = new int[prices.length];
        Stack<Integer>st = new Stack<>();
        st.push(-1);
        for(int i=0; i<prices.length; i++){
            while(st.size()>1 && prices[st.peek()]<=prices[i]){
                st.pop();
            }
            int val = i-st.peek();
            System.out.print(i+" "+val+" "+st.peek()+", ");
            ans[i]=val;
            st.push(i);
        }
        return ans;
    }
}
