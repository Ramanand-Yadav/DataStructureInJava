
package Heaps.medium;
import java.util.*;
// import javafx.util.Pair; 

public class corresponding {
    static class Pair{
        int val;
        int ind;
        Pair(int val, int ind){
            this.val = val;
            this.ind = ind;
        }
    }
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(4);
        al.add(4);al.add(6);al.add(2);al.add(90);
        List<Integer> ans = replaceWithRank(al, 4);
        for(int val : ans){
            System.out.print(val+" ");
        }
    }
    public static List<Integer> replaceWithRank(List<Integer> arr, int n) {
        // Write your code here
        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->Double.compare(a.val, b.val));
        for(int i=0; i<arr.size(); i++){
            Pair p = new Pair(arr.get(i), i);
            pq.add(p);
        }
        List<Integer>al = new ArrayList<>(arr.size());
        int[] arr2 = new int[arr.size()];
        int rank = 1;
        int lastEle = pq.peek().val;
        while(!pq.isEmpty()){
            if(lastEle!=pq.peek().val){
                rank++;
            }
            Pair p = pq.remove();
            // al.add(p.ind,rank);
            arr2[p.ind] = rank;
            lastEle = p.val;
        }
        for(int val : arr2){
            al.add(val);
        }
        return al;
    }
}
