package Heaps.Learning;

// import java.util.*;

class MinHeap {

    // Constructor for the class.
    int[] list;
    int capacity; 
    int size;
    MinHeap(int size) {
        // Write your code here.
        size=0; 
        list = new int[size];
        capacity = size;
    }

    // Implement the function to remove minimum element.
    int extractMinElement() {
        // Write you code here.
        if(size==0)return -1;
        int val = list[0];
        swap(0,size-1);
        size--;
        heapify(0);
        return val;
    }

    // Implement the function to delete an element.
    void deleteElement(int ind) {
        // Write you code here.
        if(ind>=size)return;
        swap(ind,size-1);
        size--;
        heapify(ind);
    }

    // Implement the function to insert 'val' in the heap.
    void insert(int val) {
        // Write you code here.
        if(size==capacity)return;
        list[size]=val;
        size++;
        int ind = size-1;
        while(ind>=0){
            int p = (ind-1)/2;
            if(list[p]-list[ind]>0){
                swap(p,ind);
                ind=p;
            }else break;
        }
    }
    private void swap(int ind1, int ind2){
        int temp = list[ind1];
        list[ind1]=list[ind2];
        list[ind2]=temp;
    }
    private void heapify(int index){
        int min = index;
        int left = index*2+1;
        int right = index*2+2;
        if(left<size && list[min]>list[left]){
            min=left;
        }
        if(right<size && list[min]>list[right]){
            min=right;
        }
        if(min!=index){
            swap(min, index);
            heapify(min);
        }
    }
}
