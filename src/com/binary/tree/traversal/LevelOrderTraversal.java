package com.binary.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {


    public void levelOrder(){
        System.out.println("\n==== Level Order Traversal ====");
        BuildTree bt = new BuildTree();
        TreeNode node = bt.getTreeType1();
        if(node == null){
            return;
        }
        else{
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(node);
            while(!q.isEmpty()){
                node = q.poll();
                System.out.print(node.value+" ");
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
        }
    }
}
