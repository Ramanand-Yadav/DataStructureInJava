package BinaryTrees.Medium1;

public class daimeter {
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
    public int diameterOfBinaryTree(TreeNode root) {
        return dfs(root);
    }
    public int dfs(TreeNode node){
        if(node==null)return 0;
        int lh=height(node.left);
        int rh=height(node.right);
        int dai = lh+rh;
        int ld = dfs(node.left);
        int rd = dfs(node.right);
        return Math.max(dai,Math.max(ld,rd));
    }
    public int height(TreeNode node){
        if(node==null)return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
    public int height1(TreeNode node, int[] diameter) {
        if (node == null) {
            return 0;
        }
        int lh = height1(node.left, diameter);
        int rh = height1(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
}
