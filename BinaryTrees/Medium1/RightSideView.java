package BinaryTrees.Medium1;
import java.util.*;
public class RightSideView {
    static int maxLevel = 0;
    public static void main(String[] args) {
        
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        if(root==null) return al;
        solve(root, al, 1);
        return al;
    }
    public static void solve(TreeNode root, List<Integer> al, int level){
        if(root == null) return;
        if(maxLevel<level){
            al.add(root.val);
            maxLevel = level;
        }
        solve(root.right, al, level+1);
        solve(root.left, al, level+1); 
    }
}
