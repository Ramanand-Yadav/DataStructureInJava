package BinaryTrees.Medium1;

import java.util.ArrayList;
import java.util.List;

public class RootToNode {
    public static void main(String[] args) {
        
    }
    public static List<String> allRootToLeaf(TreeNode root) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        
        helper(root,root.val+"", ans);
        return ans;
    }
    public static void helper(TreeNode node, String path, List<String>al){
        if(node.left==null && node.right==null){
            al.add(path);
            return;
        }
        if(node.left!=null)helper(node.left, path+" "+node.left.val,al);
        if(node.right!=null)helper(node.right,path+" "+node.right.val,al);
    }
}
