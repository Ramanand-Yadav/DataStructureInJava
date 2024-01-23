package Heaps.Learning;

import java.util.*;

public class implementPop {
    public static void main(String[] args) {
        
    }
    public static int pop(List<Integer> heap) {
        // Write you code here.
        if(heap.isEmpty())return -1;
        int temp = heap.get(0);
        int last = heap.get(heap.size()-1);
        if(!heap.isEmpty()){
            heap.set(0,last);
            downheap(0, heap);
        }
        return temp;
    }
    private static void downheap(int index,List<Integer> heap){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left<heap.size() && heap.get(min)-heap.get(left)>0){
            min = left;
        }
        if(right<heap.size() && heap.get(min)-heap.get(right)>0){
            min=right;
        }
        if(min!=index){
            swap(min, index,heap);
            downheap(min, heap);
        }
    }
    private static void swap(int first, int second, List<Integer> heap){
        int temp=heap.get(first);
        heap.set(first,heap.get(second));
        heap.set(second, temp);
    }
    private static int left(int index){
        return (index*2)+1;
    }
    private static int right(int index){
        return (index*2)+2;
    }
}
