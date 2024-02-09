package BinaryTrees.Traversal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postOrder {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        if(root==null)return al;
        // print1(root,al);
        Stack<TreeNode>st1 = new Stack<>();
        Stack<TreeNode>st2 = new Stack<>();
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode node = st1.peek();
            st1.pop();
            st2.push(node);
            if(node.left!=null)st1.push(node.left);
            if(node.right!=null)st1.push(node.right);
        }
        while(!st2.isEmpty()){
            al.add(st2.peek().val);
            st2.pop();
        }
        return al;
    }
}
