package LinkedList.MediumProblemLL;


public class sortLL {
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
    public static Node sortList(Node head) {
        //Write your code here
        if(head==null || head.next==null) return head;
        Node prev=null, slow=head, fast=head;

        while(fast != null  && fast.next!=null){
            prev = slow; 
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        Node l1 = sortList(head);
        Node l2 = sortList(slow);

        return merge(l1,l2);
    }
    private static Node merge(Node l1, Node l2){
        Node l = new Node(), p=l;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
    
        if (l1 != null)
            p.next = l1;
    
        if (l2 != null)
            p.next = l2;
    
        return l.next;
    }
    */
}
