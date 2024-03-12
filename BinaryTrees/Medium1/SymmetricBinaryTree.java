package BinaryTrees.Medium1;

public class SymmetricBinaryTree {
    public static void main(String[] args) {
        
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode root1 = root.left;
        TreeNode root2 = root.right; 
        return check(root1, root2);
    }
    public boolean check(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null)return false;
        if(root1.val!=root2.val)return false;
        if((check(root1.left,root2.right)) && (check(root1.right, root2.left)))return true; 
        return false;
    }
}
