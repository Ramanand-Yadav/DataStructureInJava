package BinaryTrees.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
    List<List<Integer>>al=new ArrayList<>();
    class TreeNode1 {
        int val;
        TreeNode1 left;
        TreeNode1 right;
        TreeNode1() {}
        TreeNode1(int val) { this.val = val; }
        TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    class TreeNode<T>{
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        
    }
    public static List<Integer> levelOrder1(TreeNode<Integer> root){
        // Write your code here.
        List<Integer>ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode<Integer>>que = new LinkedList<>();
        que.add(root);
        while(que.size()!=0){
            int n = que.size();
            for(int i=0; i<n; i++){
                TreeNode<Integer> node = que.poll();
                ans.add(node.data);
                if(node.left!=null)que.add(node.left);
                if(node.right!=null)que.add(node.right);
            }
        }
        return ans;
    }

    public void helper(TreeNode1 node, int lvl){
        if(node==null)return;
        if(al.size()==lvl){
            al.add(new ArrayList<Integer>());
        }
        al.get(lvl).add(node.val);
        helper(node.left,lvl+1);
        helper(node.right,lvl+1);
    }
    public List<List<Integer>> levelOrder2(TreeNode1 root) {
        if(root==null)return al;
        helper(root,0);
        return al;
    }

}
