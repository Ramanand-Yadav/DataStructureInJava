package BinaryTrees.Medium1;

public class MaxPathSum {
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
    public int maxPathSum(TreeNode root) {
        int[] dai = new int[1];
        dai[0]=Integer.MIN_VALUE;
        helper(root,dai);
        return dai[0];
    }
    private int helper(TreeNode node, int[] dai){
        if(node==null)return 0;
        int ls=Math.max(0,helper(node.left,dai));
        int rs=Math.max(0,helper(node.right,dai));
        dai[0]=Math.max(dai[0],node.val+ls+rs);
        // System.out.println(dai[0]+" "+node.val);
        return Math.max(ls,rs)+node.val;
    }
}
