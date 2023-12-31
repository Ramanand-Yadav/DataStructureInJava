package LinkedList.MediumProblemLL;

public class detectCycleinLL {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Node {
        public int data;
        public Node next;
       
        Node()
        {
            this.data = 0;
            this.next = null;
        }
       
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
       
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        
    }
    public static boolean detectCycle(Node head) {
        //Your code goes here
        if(head==null) return false;
        if(head.next == head) return true;
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) return true;
        }
        return false;
    }

}
