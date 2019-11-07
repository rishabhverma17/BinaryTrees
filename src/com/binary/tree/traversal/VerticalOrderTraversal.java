package com.binary.tree.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {
    public void verticalOrder(){
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
                if(map.containsKey(vNode.distance)){
                    map.get(vNode.distance).add(vNode.node);
                }
                else{
                    ArrayList<TreeNode> nodeList = new ArrayList<>();
                    nodeList.add(vNode.node);
                    map.put(vNode.distance,nodeList);
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
                ArrayList<TreeNode> al = map.get(key);
                for(TreeNode myNode : al){
                    System.out.print(myNode.value+" ");
                }
                System.out.println();
            }
        }
    }
}
