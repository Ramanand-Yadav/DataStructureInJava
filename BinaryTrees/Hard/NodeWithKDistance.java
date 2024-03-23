package BinaryTrees.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class NodeWithKDistance {
    public static void main(String[] args) {
        
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode>que1 = new LinkedList<>();
        Map<TreeNode, TreeNode>map = new HashMap<>();
        Queue<TreeNode>que = new LinkedList<>();
        Map<TreeNode, Boolean> map2 = new HashMap<>();
        que1.add(root);
        que.add(target);
        while(!que1.isEmpty()){
                TreeNode node = que1.poll();
                if(node.left!=null){
                    que1.add(node.left);
                    map.put(node.left, node);
                }
                if(node.right!=null){
                    que1.add(node.right);
                    map.put(node.right, node);
                }
        }
        
        int currLev = 0;
        map2.put(target, true);
        while(!que.isEmpty()){
            int size = que.size();
            if(currLev++==k){
                break;
            }
            // map2.put(target, true);
            for(int i=0; i<size; i++){
                TreeNode current = que.poll();
                if(current.left!=null && !map2.containsKey(current.left)){
                    que.add(current.left);
                    map2.put(current.left, true);
                }
                if(current.right!=null && !map2.containsKey(current.right)){
                    que.add(current.right);
                    map2.put(current.right, true);
                }

                if(map.containsKey(current) && !map2.containsKey(map.get(current))){
                    que.add(map.get(current));
                    map2.put(map.get(current), true);
                }
            }
        }
        List<Integer>ans = new ArrayList<>();
        while(!que.isEmpty()){
            TreeNode node = que.poll();
            ans.add(node.val);
        }
        return ans;
    }
}
