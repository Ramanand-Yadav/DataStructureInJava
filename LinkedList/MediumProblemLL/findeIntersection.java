package LinkedList.MediumProblemLL;

import java.util.HashSet;
import java.util.Set;

public class findeIntersection {
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
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        Set<Node> set = new HashSet<>();
        Node temp = firstHead;
        while(temp!=null){
            set.add(temp);
            temp = temp.next;
        }
        temp = secondHead;
        while(temp!=null){
            if(set.contains(temp)) return temp.data;
            temp = temp.next;
        }
        return -1;
    }
}
