package BinaryTrees.Hard;

import java.util.HashMap;
import java.util.Map;

public class buildTree {
    public static void main(String[] args) {
        
    }
    public static TreeNode buildTree1(int[] preorder, int[] inorder) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree2(preorder, 0, preorder.length-1, inorder,0,inorder.length-1,map);
        return root; 
    }
    private static TreeNode buildTree2(int[] preorder, int prest, int preend, int[] inorder, int inst, int inend, Map<Integer, Integer>map){
        if(prest>preend || inst>inend)return null;
        TreeNode node = new TreeNode(preorder[prest]);
        int inRoot = map.get(preorder[prest]);
        int numsLeft = inRoot-inst;

        node.left = buildTree2(preorder, prest+1, prest+numsLeft, inorder, inst, inRoot-1,map);
        node.right = buildTree2(preorder,prest+numsLeft+1,preend, inorder, inRoot+1, inend, map);
        return node;
    }
}
