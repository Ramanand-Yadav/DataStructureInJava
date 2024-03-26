package BinaryTrees.Hard;

import java.util.HashMap;
import java.util.Map;

public class buildTree2 {
    public static void main(String[] args) {
        
    }
    public static TreeNode getTreeFromPostorderAndInorder(int[] postOrder, int[] inOrder) {
        // Write your code here
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<inOrder.length; i++){
            map.put(inOrder[i], i);
        }
        return help(inOrder, 0, inOrder.length-1, postOrder, 0, postOrder.length-1, map);
    }
    private static TreeNode help(int[] inorder, int inst, int inend, int[] postorder, int post, int poend, Map<Integer,Integer>map){
        if(inst>inend || post>poend)return null; 
        TreeNode node = new TreeNode(postorder[poend]);
        int inInd = map.get(postorder[poend]);
        int len = inInd - inst; 
        TreeNode left = help(inorder, inst, inInd-1,postorder, post, post+len-1, map);
        TreeNode right = help(inorder, inInd+1, inend, postorder, post+len, poend-1, map);
        node.left = left; 
        node.right = right; 
        return node;
    }
}
