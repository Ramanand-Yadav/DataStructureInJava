package LinkedList.MediumProblemLL;

public class deletMiddle {
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
    /* 
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        Node start = new Node();
        start.next = head;
        Node slow = start;
        Node fast = start;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
    */
}
