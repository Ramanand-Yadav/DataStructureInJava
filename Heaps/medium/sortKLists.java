package Heaps.medium;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class sortKLists {
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		PriorityQueue<Integer>pque = new PriorityQueue<>();
		for(ArrayList<Integer>al : kArrays){
			for(int val : al){
				pque.add(val);
			}
		}
		ArrayList<Integer>al = new ArrayList<>();
		while(pque.size()>0){
			al.add(pque.remove());
		}
		return al;
		
	}
}
