package com.binary.tree.views;

import com.binary.tree.traversal.BuildTree;
import com.binary.tree.traversal.TreeNode;
import com.binary.tree.traversal.VerticalTraversalNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
    public void topViewBinarytree(){
        BuildTree bt = new BuildTree();
        TreeNode node = bt.getTreeType1();
        if(node == null){
            return;
        }
        else{
            TreeMap<Integer, TreeNode> map = new TreeMap<>();
            Queue<VerticalTraversalNode> q = new LinkedList<>();
            VerticalTraversalNode vNode = new VerticalTraversalNode(node,0);
            q.offer(vNode);
            while(!q.isEmpty()){
                vNode = q.poll();
                if(!map.containsKey(vNode.distance)){
                    map.put(vNode.distance,vNode.node);
                }
                if(vNode.node.left != null){
                    q.offer(new VerticalTraversalNode(vNode.node.left, vNode.distance -1));
                }
                if(vNode.node.right != null){
                    q.offer(new VerticalTraversalNode(vNode.node.right, vNode.distance +1));
                }
            }

            // Print the map
            for(int key : map.keySet()){
                System.out.print(map.get(key).value+" ");
                System.out.println();
            }
        }
    }
}
