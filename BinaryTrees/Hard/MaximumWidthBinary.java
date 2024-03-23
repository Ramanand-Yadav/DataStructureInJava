package BinaryTrees.Hard;

import java.util.*;

public class MaximumWidthBinary {
    public static void main(String[] args) {
        
    }
    public int widthOfBinaryTree(TreeNode root){
        int ans = 0;
        if(root==null)return ans;
        Queue<Pair>que = new LinkedList<>();
        que.add(new Pair(root, 0));
        while(!que.isEmpty()){
            int size = que.size();
            int nmin = que.peek().num;
            int first = 0; int last = 0;
            for(int i=0; i<size; i++){
                Pair p = que.poll();
                int currId = p.num-nmin;
                if(i==0)first=currId;
                if(i==size-1)last=currId;
                if(p.node.left!=null)que.add(new Pair(p.node.left, currId*2+1));
                if(p.node.right!=null)que.add(new Pair(p.node.right, currId*2+2));
            }
            ans = Math.max(ans, last-first+1);
        }
        return ans;
    }

}
