package BinaryTrees.Traversal;

import java.util.ArrayList;
import java.util.List;


public class BinaryTreeTraversal {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        List<Integer>al1 = new ArrayList<>();
        List<Integer>al2 = new ArrayList<>();
        // PreOrder(root,al2);
        List<Integer>al3 = new ArrayList<>();
        // PostOrder(root,al3);
        InOrder(root,al1,al2,al3);

        List<List<Integer>>ans=new ArrayList<>();
        ans.add(al1);
        ans.add(al2);
        ans.add(al3);
        return ans;
    }
    public static void InOrder(TreeNode root,List<Integer>al1, List<Integer>al2, List<Integer>al3){
        if(root!=null){
            al2.add(root.data);
            InOrder(root.left, al1,al2,al3);
            al1.add(root.data);
            InOrder(root.right, al1,al2,al3);
            al3.add(root.data);
        }
    }
    public static void PreOrder(TreeNode root,List<Integer>al2){
        if(root!=null){
            al2.add(root.data);
            PreOrder(root.left, al2);
            PreOrder(root.right, al2);
        }
    }
    public static void PostOrder(TreeNode root,List<Integer>al3){
        if(root!=null){
            PostOrder(root.left, al3);
            PostOrder(root.right, al3);
            al3.add(root.data);
        }
    }
}
