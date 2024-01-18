package Heaps.Advance;
import java.util.*;
public class topK {
    public static void main(String[] args) {
        
    }
}
class Solution {
    class pair{
        int val;
        int key;
        pair(int val, int key){
            this.val = val;
            this.key = key;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp = new HashMap<>();
        for(int val : nums){
            if(mp.containsKey(val))mp.put(val,mp.get(val)+1);
            else mp.put(val,1);
        }
        PriorityQueue<pair>pq = new PriorityQueue<>((a,b)->b.key-a.key);
        for(int val : mp.keySet()){
            pair p = new pair(val,mp.get(val));
            pq.add(p);
        }
        int[] ans = new int[k];
        int i=0;
        while(k>0){
            pair p = pq.remove();
            ans[i]=p.val;
            i++;
            k--;
        }
        return ans;
    }
}
//n+n+k=>3*n
