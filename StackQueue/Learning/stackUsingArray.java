package StackQueue.Learning;

public class stackUsingArray {
        static class Stack {

        int[] arr;

        int index;

        int mycapacity;

        Stack(int capacity) {

            // Write your code here.

            arr=new int[capacity];

            index=-1;

            mycapacity = capacity;

        }

        public void push(int num) {

            // Write your code here.

            if(isFull()==0){

            index++;

            arr[index]=num;

            }

        }

        public int pop() {

            // Write your code here.

            int top=0;

            if(isEmpty()==0){

                top = arr[index];

                arr[index] = 0;

                index=index-1;

                return top;

            }

            return -1;

        }

        public int top() {

            // Write your code here.

            if(isEmpty()==0){

            return arr[index];

            }

            return -1;

        }

        public int isEmpty() {

            // Write your code here.

            return index==-1?1:0;

        }

        public int isFull() {

            // Write your code here.

            return index+1==mycapacity?1:0;

        }

    }
    public static void main(String[] args) {
        Stack st = new Stack(7); 
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.pop());
        System.out.println(st.top());
    }

}

