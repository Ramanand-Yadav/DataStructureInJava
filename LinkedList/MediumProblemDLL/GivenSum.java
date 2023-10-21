package LinkedList.MediumProblemDLL;

import java.util.*;

public class GivenSum {
    public static class Node{
        public int data;
        public Node next;
        Node(){
            this.data = 0;
            this.next = null;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    static class Pair{
        public int first;
        public int second;

        Pair(){}
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("Inter Numbers of Node in LinkList");
            int n = scn.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the "+n+" value");

            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            
            Node head = createLinkList(arr,n);
            System.out.println("head of LinkList : "+head.data);
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data);
                if(temp.next!=null) System.out.print("->");
                temp = temp.next;
            }
            System.out.println();
            System.out.println("Enter the value of K : ");
            int k = scn.nextInt();
            PairWithSum(head,k);
        }
        
        
        // for(int val : arr){
        //     System.out.println(val);
        // }
    }
    private static boolean PairWithSum(Node head, int k){
        Set<Integer> set = new HashSet<>();
        List<Pair> al = new ArrayList<>();
        System.out.println("call");

        Node temp = head;
        while(temp.next != null){
            if(temp.data<=k){
                if(set.contains(temp.data)){
                    Pair p = new Pair(temp.data, k-temp.data);
                    al.add(p);
                    set.remove(temp.data);
                }else{
                    set.add(k-temp.data);
                }
            }
            temp = temp.next;
        }
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i).first+" "+al.get(i).second);
        }
        return true;
    }
    private static Node createLinkList(int[] arr, int n){
        Node temp = new Node();
        Node head = temp;
        for(int i=0; i<n; i++){
            Node node = new Node(arr[i]);
            temp.next = node;
            temp = temp.next;
        }
        return head.next;
    }
}
