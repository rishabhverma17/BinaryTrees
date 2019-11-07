package com.binary.tree.views;

import com.binary.tree.traversal.BuildTree;
import com.binary.tree.traversal.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class RightView {
    public void rightView(){
        BuildTree bt = new BuildTree();
        TreeNode node = bt.getTreeType2();
        if(node == null){
            return;
        }
        else{
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(node);
            while(!q.isEmpty()){
                int count = q.size();
                while(count > 0){
                    node = q.poll();
                    if(count == 1){
                        System.out.print(node.value+" ");
                    }
                    if(node.left != null){
                        q.offer(node.left);
                    }
                    if(node.right != null){
                        q.offer(node.right);
                    }
                    count--;
                }
            }
        }
    }
}
