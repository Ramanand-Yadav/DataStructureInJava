package StackQueue.Learning;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsing2Queue {
    static class Stack {
        // Define the data members.
        Queue<Integer>q1;
        Queue<Integer>q2;
        public Stack() {
            // Implement the Constructor.
            q1 = new LinkedList<>();
            q2 = new LinkedList<>();
        }

        /*----------------- Public Functions of Stack -----------------*/

        public int getSize() {
            // Implement the getSize() function.
            return q1.size();
        }

        public boolean isEmpty() {
            // Implement the isEmpty() function.
            return q1.size()>0?false:true;
        }

        public void push(int element) {
            // Implement the push(element) function.
            q1.add(element);
        }

        public int pop() {
            // Implement the pop() function.
            if(isEmpty()==false){
                while(q1.size()!=1){
                    q2.add(q1.remove());
                }
                int top = q1.remove();
                while(q2.size()>0){
                    q1.add(q2.remove());
                }
                return top;
            }
            return -1;
        }

        public int top() {
            // Implement the top() function.
            if(isEmpty()==false){
                while(q1.size()!=1){
                    q2.add(q1.remove());
                }
                int top = q1.remove();
                q2.add(top);
                while(q2.size()>0){
                    q1.add(q2.remove());
                }
                return top;
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4); stack.push(6);
        System.out.println(stack.top());
    }
}
