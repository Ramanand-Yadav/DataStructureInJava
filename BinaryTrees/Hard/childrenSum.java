package BinaryTrees.Hard;

public class childrenSum {
    static boolean flag = true;
    public static void main(String[] args) {
        
    }
    public static boolean isParentSum(TreeNode root) {
        // Write your code here.
        if(root==null)return false;
        help(root);
        return flag;
    }
    private static void help(TreeNode node){
        if(node==null)return; 
        if(node.left!=null || node.right!=null){
            int sum = 0; 
            if(node.left!=null){
                sum+=node.left.val;
            }
            if(node.right!=null){
                sum+=node.right.val;
            }
            if(sum!=node.val){
                flag=false;
            }
        }
        help(node.left);
        help(node.right);
    }
}
