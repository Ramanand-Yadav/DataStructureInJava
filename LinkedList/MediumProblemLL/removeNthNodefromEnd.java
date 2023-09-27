package LinkedList.MediumProblemLL;

public class removeNthNodefromEnd {
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
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        Node start = new Node();
        start.next = head;
        Node slow = start;
        Node fast = start;
        for(int i=1; i<=K; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next; 
        return start.next;
    }
    */
}
