package Heaps.Hard;

import java.util.PriorityQueue;

public class findMedian {
    public static void main(String[] args) {
        
    }
    class MedianFinder {
    PriorityQueue<Integer>minHeap,maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b)->(b-a));
    }
    
    public void addNum(int num) {
        if(minHeap.isEmpty()||num>minHeap.peek()){
            minHeap.offer(num);
        }else{
            maxHeap.offer(num);
        }
        if(minHeap.size()-maxHeap.size()>1){
            maxHeap.offer(minHeap.poll());
        }
        if(maxHeap.size()-minHeap.size()>1){
            minHeap.offer(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()!=minHeap.size()){
            return (double)maxHeap.size()>minHeap.size()?maxHeap.peek():minHeap.peek();
        }
        else return (double)(maxHeap.peek()+minHeap.peek())/(double)2;
    }
}
}
