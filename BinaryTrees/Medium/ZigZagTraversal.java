package BinaryTrees.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversal {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode>que = new LinkedList<>();
        que.add(root);
        int level=0;
        while(!que.isEmpty()){
            List<Integer>al=new ArrayList<>();
            int size = que.size();
            for(int i=0; i<size; i++){
                TreeNode node = que.poll();
                if(node.left!=null)que.add(node.left);
                if(node.right!=null)que.add(node.right);
                if(level%2==1)al.add(0,node.val);
                else al.add(node.val);
            }
            level++;
            ans.add(al);
        }
        return ans;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
        List<TreeNode>trv=new ArrayList<>();
        trv.add(root);
        boolean flag=true;
        while(trv.size()>0){
            List<TreeNode>al=new ArrayList<>();
            List<Integer>al1=new ArrayList<>();
            if(flag){
                for(int i=0; i<trv.size(); i++){
                    TreeNode node = al.get(i);
                    al1.add(node.val);
                    if(node.left!=null)al.add(node.left);
                    if(node.right!=null)al.add(node.right);
                }
                flag=false;
            }else{
                for(int i=trv.size()-1; i>=0; i--){
                    TreeNode node = al.get(i);
                    al1.add(node.val);
                    if(node.left!=null)al.add(node.left); 
                    if(node.right!=null)al.add(node.right);

                }
                flag=true;
            }
            trv=al;
            ans.add(new ArrayList<>(al1));
        }
        return ans;
    }

}
