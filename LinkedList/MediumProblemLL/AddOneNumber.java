package LinkedList.MediumProblemLL;

public class AddOneNumber {
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
    public static Node addNode(Node head) {
		// Write your code here.
		int val1 = 0;
		Node temp = head;
		// boolean isNine=false;
		while(temp!=null){
			val1 = val1*10 + temp.data;
			// if(temp.data==9) isNine=true;
			temp = temp.next;
		}
		String str =Integer.toString(val1);
		val1 = val1 + 1;
		String str1 = Integer.toString(val1);
		Node tem = new Node();
		Node stem = tem;
		temp = head;
		if(str.length()==str1.length()){
			for(int i=0; i<str1.length(); i++){
				if(temp.data==(int) str1.charAt(i)){
					tem.next = temp;
					tem = tem.next;
				}else{
					int val = (int) str1.charAt(i);
					Node ne = new Node(val);
					tem.next = ne;
					tem = tem.next;
				}
				head = head.next;
			}
		}else{
			for(int i=0; i<str1.length(); i++){
				Node ne = new Node((int) str1.charAt(i));
				tem.next = ne; 
				tem = tem.next;
			}
		}
		return stem.next;
	}
}
