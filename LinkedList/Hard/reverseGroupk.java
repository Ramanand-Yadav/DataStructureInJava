package LinkedList.Hard;

public class reverseGroupk {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    static class Node {
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
    public static Node kReverse(Node head, int k) {
        // Write your code here.
        int n = 0;
        Node temp = head;
        if(head==null || head.next==null)return head;
        while(temp!=null){
            n++;
            temp = temp.next; 
        }
        
        temp = head;
        Node st = new Node(0);
        st.next = head;
        Node pre = st; 

        Node nex;
        Node cur;
        while(n>=k){
            cur = pre.next;
            nex = cur.next;
            for(int i=1; i<k; i++){
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            n = n-k;
        }
        return st.next;
    }
}
