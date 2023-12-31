package LinkedList.MediumProblemLL;

public class firstNode {
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
    public static Node firstNode(Node head) {
        if(head==null || head.next==null) return null;
        if(head.next==head) return head;
        Node slow = head.next;
        Node fast = head.next.next;
        while(fast!=null && fast.next!=null && slow!=fast){
            fast = fast.next.next;
            slow = slow.next;
        } 
        if(fast==null || fast.next==null) return null;
        slow = head;
        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    */
}
