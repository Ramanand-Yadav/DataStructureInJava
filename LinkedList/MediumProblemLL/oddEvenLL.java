package LinkedList.MediumProblemLL;

public class oddEvenLL {
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
    public static ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode even = null;
        ListNode odd = null;
        ListNode oddhead = null;
        ListNode evenhead = null;
        ListNode nextNode = null;
        while(head.next!=null){
            nextNode = head.next;
            if(head.val%2==0){
                if(even!=null){
                    even.next = head;
                    even = even.next;
                }else{
                    even = head;
                    evenhead = head;
                }
            }else{
                if(odd!=null){
                    odd.next = head;
                    odd = odd.next;
                }else{
                    odd = head;
                    oddhead = head;
                }
            }
            head.next = null;
            head = nextNode;
        }
        if(head.val%2==0){
            if(even!=null){
                even.next = head;
                even = even.next;
            }else{
                even = head;
                evenhead = head;
            }
        }else{
            if(odd!=null){
                odd.next = head;
                odd = odd.next;
            }else{
                odd = head;
                oddhead = head;
            }
        }
        if(odd!=null){
            odd.next = evenhead;
            return oddhead;
        }else{
            return even;
        }
    }
}
