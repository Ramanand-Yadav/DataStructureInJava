package LinkedList.MediumProblemLL;

public class reverseLL {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static void main(String[] args) {
        
    }
    public ListNode reverseListRecursive(ListNode head) {
        if(head==null) return head;
        if(head.next == null ) return head;
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode nextNode = null; 
        while(head.next != null ){
            nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        nextNode = head.next;
        head.next = prevNode;
        return head;
    }
}
