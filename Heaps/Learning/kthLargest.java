package Heaps.Learning;

import java.util.PriorityQueue;

public class kthLargest {
    public static void main(String[] args) {
        // kthLargest kth = new kthLargest();
        // kth.add(5);
    }
    static class Kthlargest {
        PriorityQueue<Integer>que; 
        int k;
        Kthlargest(int k, int []arr) {
            this.k = k;
            que = new PriorityQueue<>();
            for(int i=0; i<arr.length; i++){
                if(que.size()<k){
                    que.add(arr[i]);
                }else{
                    if(que.peek()<arr[i]){
                        que.remove();
                        que.add(arr[i]);
                    }
                }
            }
        }

        int add(int val) {
            if(!que.isEmpty() && que.size()>=k){
                if(val>que.peek()){
                    que.remove();
                    que.add(val);
                }
            }else{
                que.add(val);
            }
            return que.peek();
        }
    }
}
