package LinkedList.MediumProblemLL;

public class pailendromeLL {
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
    
    public static boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        ListNode temp = head;
        StringBuilder str = new StringBuilder();
        while(temp != null){
            str.append(temp.val);
            temp = temp.next;
        }
        int i=0; int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome(Node head) {
        if(head==null){

            return true;

        }

        if(head.next==null){

            return true;

        }

       

        Node tem = head;

        int count =0;

        while(tem!=null){

           count++;

            tem = tem.next;

        }

        int [] arr= new int[count];

         tem = head;

        int i =0;

        while(tem!=null){

            arr[i]=tem.data;

            tem = tem.next;

            i++;

        }

         i =0;

        int j = count-1;

        while(j>i){

            if(arr[i]!=arr[j]){

                return false;

            }

            i++;

            j--;

        }

        return true;
    }

}
