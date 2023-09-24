package LinkedList.MediumProblemDLL;

public class medianOfll {
    public static class Node{
        public int data;
        public Node next;
        Node(){
            this.data = 0;
            this.next = null;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; this.next = next; 
        }
    }
    public static void main(String[] args) {
        
    }
}
