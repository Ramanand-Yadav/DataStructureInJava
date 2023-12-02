package StackQueue.ImplementProblem;

import java.util.HashMap;
import java.util.Map;

public class lrucache {
    class LRUCache
    {
        class Node{
            Node prev,next;
            int key, val;
            Node(int key,int val){
                this.key = key;
                this.val = val;
            }
        }
        Node head=new Node(0,0); Node tail = new Node(0, 0);
        int capacity; 
        Map<Integer,Node>mp = new HashMap<>();
        public LRUCache(int capacity) {
            head.next = tail;
            tail.prev = head;
            this.capacity = capacity;
        }

        public int get(int key) {
            if(mp.containsKey(key)){
                Node node = mp.get(key);
                remove(node);
                insert(node);
                return node.val;
            }
            return -1;
        }

        public void put(int key, int value) {
            if(mp.containsKey(key)){ 
                remove(mp.get(key));
            }
            if(mp.size()==capacity) remove(tail.prev);
            insert(new Node(key, value));
        }
        public void remove(Node node){
            mp.remove(node.key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        public void insert(Node node){
            mp.put(node.key, node);
            node.next = head.next;
            node.prev = head;
            head.next = node;
            node.next.prev = node;
        }
        // LRUCache(int capacity)
        // {
        //     // Write your code here
        // }

        // public int get(int key)
        // {
        //     // Write your code here
        // }

        // public void put(int key, int value)
        // {
        //     // Write your code here
        // }
    }   
    public static void main(String[] args) {
        
    }
}
