package Heaps.Learning;

public class Main {
    public static void main(String[] args) throws Exception{
        Heap<Integer> heap = new Heap<>();
        
        heap.insert(23);
        heap.insert(54);
        heap.insert(67);
        heap.insert(1);
        heap.insert(3);

        System.out.println(heap.remove());
        // System.out.println(heap.heapSort());

        
    }
}
