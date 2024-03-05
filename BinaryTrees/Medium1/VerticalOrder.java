package BinaryTrees.Medium1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrder {
    class Solution {
    class Pair{
        TreeNode val; 
        int col;
        int row;
        Pair(TreeNode val, int col, int row){
            this.val=val;
            this.col=col;
            this.row=row;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer,PriorityQueue<Integer>>>mp=new TreeMap<>();
        Queue<Pair>que = new LinkedList<>();
        que.add(new Pair(root,0,0));
        while(!que.isEmpty()){
            int size = que.size();
            for(int i=0; i<size; i++){
                Pair p = que.remove();
                if(p.val.left!=null)que.add(new Pair(p.val.left,p.col-1, p.row+1));
                if(p.val.right!=null)que.add(new Pair(p.val.right, p.col+1, p.row+1));
                if(mp.containsKey(p.col)){
                    TreeMap<Integer,PriorityQueue<Integer>>mp1 = mp.get(p.col);
                    if(mp1.containsKey(p.row)){
                        PriorityQueue<Integer>queue = mp1.get(p.row);
                        queue.add(p.val.val);
                        mp1.put(p.row, queue);
                        mp.put(p.col, mp1);
                    }else{
                        PriorityQueue<Integer>pque = new PriorityQueue<>();
                        pque.add(p.val.val);
                        mp1.put(p.row, pque);
                        mp.put(p.col, mp1);
                    }
                }else{
                    TreeMap<Integer, PriorityQueue<Integer>>mp1 = new TreeMap<>();
                    PriorityQueue<Integer>pque = new PriorityQueue<>();
                    pque.add(p.val.val);
                    mp1.put(p.row, pque);
                    mp.put(p.col, mp1);
                }
            }
        }
        List<List<Integer>>ans = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> mp1 : mp.values()){
            ans.add(new ArrayList<Integer>());
            for(PriorityQueue<Integer>nodes : mp1.values()){
                while(!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
    }
}
    public static void main(String[] args) {
        
    }
}
