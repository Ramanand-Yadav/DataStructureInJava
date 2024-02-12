package BinaryTrees.Medium;

// import java.util.*;
public class heightOfTree {
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
        TreeNode node = new TreeNode(5);
        dfs(node);
    }
    private static int dfs(TreeNode node){
        if(node==null)return 0;
        return Math.max(dfs(node.left),dfs(node.right))+1;
    }
}
