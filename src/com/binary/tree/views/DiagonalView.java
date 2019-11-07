package com.binary.tree.views;

import com.binary.tree.traversal.BuildTree;
import com.binary.tree.traversal.TreeNode;
import com.binary.tree.traversal.VerticalTraversalNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class DiagonalView {
    public void printDiagonalView(){
        BuildTree bt = new BuildTree();
        TreeNode node = bt.getTreeType1();
        if(node == null){
            return;
        }
        else{
            TreeMap<Integer, ArrayList<TreeNode>> map = new TreeMap<>();
            Queue<VerticalTraversalNode> q = new LinkedList<>();
            VerticalTraversalNode vNode = new VerticalTraversalNode(node,0);
            q.offer(vNode);
            while(!q.isEmpty()){
                vNode = q.poll();
                if(!map.containsKey(vNode.distance)){
                    ArrayList<TreeNode> listNode = new ArrayList<>();
                    listNode.add(vNode.node);
                    map.put(vNode.distance,listNode);
                }
                else{
                    map.get(vNode.distance).add(vNode.node);
                }
                if(vNode.node.left != null){
                    q.offer(new VerticalTraversalNode(vNode.node.left,vNode.distance + 1));
                }
                if(vNode.node.right != null){
                    q.offer(new VerticalTraversalNode(vNode.node.right, vNode.distance));
                }
            }

            // Print the map
            for(int key : map.keySet()){
                ArrayList<TreeNode> tempList = map.get(key);
                for(TreeNode printNode : tempList){
                    System.out.print(printNode.value+" ");
                }
                System.out.println();
            }
        }
    }
}
