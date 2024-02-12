package BinaryTrees.Traversal;
import java.util.*;

public class postOrder {
    static class TreeNode {
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
        TreeNode root = new TreeNode(6);
        postorderTraversal(root);
        postorderTraversal124(root);
    }
    //using two stack
    
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
    
    
    //using 1 stack
    public static List<Integer> postorderTraversal124(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        if(root==null)return list;
        Stack<TreeNode>st=new Stack<>();
        while(root!=null||!st.isEmpty()){
            if(root!=null){
                st.push(root);
                root=root.left;
            }else{
                TreeNode temp = st.peek().right;
                if(temp==null){
                    temp=st.peek();
                    st.pop();
                    list.add(temp.val);
                    while(!st.isEmpty()&&temp==st.peek().right){
                        temp=st.peek();
                        st.pop();
                        list.add(temp.val);
                    }
                }else{root=temp;}
            }
        }
        return list;
    }
    
}
