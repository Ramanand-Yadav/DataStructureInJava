package BinaryTrees.Medium1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {
    static class Pair{
        int col; 
        TreeNode val; 
        Pair(int col, TreeNode val){
            this.col=col;
            this.val=val;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> al = getBottomView(root);
        for(int val : al){
            System.out.print(val+" ");
        }
    }
    public static List<Integer> getBottomView(TreeNode root) {
        // Write your code here.
        List<Integer> ans = new ArrayList<>();
        if(root==null)return ans;
        TreeMap<Integer, List<Integer>>mp = new TreeMap<>();
        Queue<Pair>que = new LinkedList<>();
        que.add(new Pair(0, root));
        while(que.size()>0){
            int size = que.size();
            for(int i=0; i<size; i++){
                Pair p = que.poll();
                if(p.val.left!=null)que.add(new Pair(p.col-1, p.val.left));
                if(p.val.right!=null)que.add(new Pair(p.col+1, p.val.right));
                if(mp.containsKey(p.col)){
                    mp.get(p.col).add(p.val.val);
                }else{
                    List<Integer>al=new ArrayList<>();
                    al.add(p.val.val);
                    mp.put(p.col,al);
                }
            }
        }
        for(int key : mp.keySet()){
            ans.add(mp.get(key).get(mp.get(key).size()-1));
        }
        return ans;
    }
}
