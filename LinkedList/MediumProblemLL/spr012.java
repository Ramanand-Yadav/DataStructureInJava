package LinkedList.MediumProblemLL;

public class spr012 {
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
        // Write your code here
        Node zero = new Node(),one=zero,two=zero; //make seprate list of zero, one and two
        Node zeros=null,ones=null,twos=null;//starting point of the list zero, one and two
        while(head!=null){
            Node next = head.next;
            if(head.data==0){
                zero.next = head;
                zero = zero.next;
                if(zeros==null) zeros=head;
            }else if(head.data==1){
                one.next = head;
                one = one.next;
                if(ones==null) ones=head;
            }else{
                two.next = head;
                two = two.next;
                if(twos==null) twos=head;
            }
            head.next = null;
            head=next;
        } 
        if(zeros!=null){
            if(ones!=null){
                zero.next = ones;
                if(twos!=null){
                    one.next = twos;
                }
                return zeros;
            }else{
                if(twos!=null){
                    zero.next = twos;
                }
                return zeros;
            }
        }else if(ones!=null){
            if(twos!=null){
                one.next=twos;
            }
            return ones;
        }else{
            return twos;
        }
    }
*/
}
