package BinaryTrees.Medium1;
import java.util.*;
public class RightSideView {
    
    public static void main(String[] args) {
        
    }
    public static List<Integer> rightSideTreeView(TreeNode node){
        List<Integer>ans = new ArrayList<>();
        if(node==null)return ans;
        rightView(node,ans, 0, 1);
        return ans;
    }
    private static void rightView(TreeNode node,List<Integer>al, int level, int maxLevel){
        if(node==null)return;
        if(maxLevel<level){
            al.add(node.val);
            maxLevel = level;
        }
        rightView(node.left, al, level+1, maxLevel);
        rightView(node.right, al, level+1, maxLevel);
    }
}
