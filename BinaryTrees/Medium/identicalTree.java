package BinaryTrees.Medium;

public class identicalTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(5);p.left=new TreeNode(3);
        p.left.left=new TreeNode(6);
        TreeNode q = new TreeNode(5);
        System.out.println(isSameTree(p,q));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
        if(p==null || q==null )return false;
        if(p.val!=q.val)return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
