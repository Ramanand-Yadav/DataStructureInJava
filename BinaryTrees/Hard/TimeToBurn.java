package BinaryTrees.Hard;

import java.util.*;

public class TimeToBurn {
    public static void main(String[] args) {
        
    }
    public static int timeToBurnTree(BinaryTreeNode<Integer> root, int start)
    {
        // Write your code here.
        Map<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>>map = new HashMap<>();
        Queue<BinaryTreeNode<Integer>>que = new LinkedList<>();
        BinaryTreeNode<Integer> snode=null; 
        que.add(root);
        while(!que.isEmpty()){
            BinaryTreeNode<Integer> node = que.poll();
            if(node.data==start)snode= node;
            if(node.left!=null){
                que.add(node.left);
                map.put(node.left, node);
            }
            if(node.right!=null){
                que.add(node.right);
                map.put(node.right, node);
            }
        }
        int time = 0; 
        Queue<BinaryTreeNode<Integer>>que1 = new LinkedList<>();
        Map<BinaryTreeNode<Integer>, Boolean>visited = new HashMap<>();
        if(snode==null)return 0;
        que1.add(snode);
        visited.put(snode, true);
        while(!que1.isEmpty()){
            int size = que1.size();
            time++; 
            for(int i=0; i<size; i++){
                BinaryTreeNode<Integer>node = que1.poll();
                if(node.left!=null && !visited.containsKey(node.left)){
                    que1.add(node.left);
                    visited.put(node.left, true);
                }
                if(node.right!=null && !visited.containsKey(node.right)){
                    que1.add(node.right);
                    visited.put(node.right, true);
                }
                if(map.containsKey(node) && !visited.containsKey(map.get(node))){
                    que1.add(map.get(node));
                    visited.put(map.get(node), true);
                }
            }
        }
        return time-1;
    }
}
