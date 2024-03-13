package BinaryTrees.Hard;

// import javax.swing.tree.TreeNode;

public class lowestCommonAnce {
    public static void main(String[] args) {
        
    }
    public static int lowestCommonAncestor(TreeNode root, int x, int y) {
        //    Write your code here.
        if(root==null)return -1;
        int l = lowestCommonAncestor(root.left, x, y);
        int r = lowestCommonAncestor(root.right, x, y);
        if(l!=-1&&r!=-1)return root.val;
        if(root.val==x||root.val==y)return root.val;
        return l!=-1?l:r;
    }
}
