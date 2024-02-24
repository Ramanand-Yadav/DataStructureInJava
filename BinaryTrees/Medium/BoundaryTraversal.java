package BinaryTrees.Medium;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left=new TreeNode(5);root.right=new TreeNode(20);
        root.left.left=new TreeNode(3);root.left.right=new TreeNode(8);
        root.left.right.left=new TreeNode(7);root.right.left=new TreeNode(18);
        root.right.right=new TreeNode(25);
        root.left.left.right=new TreeNode(2);
        root.left.left.right.right=new TreeNode(1);
        List<Integer>al = traverseBoundary(root);
        for(int val : al)System.out.print(val+" ");
    }
    public static List<Integer> traverseBoundary(TreeNode root){
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        if (isLeaf(root) == false) ans.add(root.val);
        addLeftBoundary(root, ans);
        addLeaves(root, ans);
        addRightBoundary(root, ans);
        return ans;
    }
    static Boolean isLeaf(TreeNode root) {
        return (root.left == null) && (root.right == null);
    }

    static void addLeftBoundary(TreeNode root, ArrayList < Integer > res) {
        TreeNode cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false) res.add(cur.val);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
    }
    static void addLeaves(TreeNode root, ArrayList < Integer > res) {
        if (isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }
    static void addRightBoundary(TreeNode root, ArrayList < Integer > res) {
        TreeNode cur = root.right;
        ArrayList < Integer > tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (isLeaf(cur) == false) tmp.add(cur.val);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }
 
}
