package com.binary.tree.core;

import com.binary.tree.traversal.BuildTree;
import com.binary.tree.traversal.TreeNode;

import java.time.Duration;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    public void countNodesInBinaryTree(){
        BuildTree bt = new BuildTree();
        TreeNode root = bt.getTreeType2();
        long startTimeRecursive = System.nanoTime();
        System.out.println("Count of Nodes Recursive: "+countNodesRecursive(root));
        long endTimeRecursive = System.nanoTime();
        long sec = (endTimeRecursive-startTimeRecursive);
        System.out.println("Time Elapsed in Recursive Solution(in Nano Seconds): "+sec);

        long startTimeIterative = System.nanoTime();
        System.out.println("Count of Nodes Iterative: "+countNodesIterative(root));
        long endTimeIterative = System.nanoTime();
        long secItr = (endTimeIterative-startTimeIterative);
        System.out.println("Time Elapsed in Recursive Solution(in Nano Seconds): "+secItr);
    }

    private int countNodesRecursive(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSubTreeCount = countNodesRecursive(root.left);
        int rightSubTreeCount = countNodesRecursive(root.right);

        return 1 + leftSubTreeCount + rightSubTreeCount;
    }
    // Level Order Traversal
    private int countNodesIterative(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        int nodesCount = 0;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode poppedNode = q.poll();
            nodesCount++;
            if(poppedNode.left != null){
                q.offer(poppedNode.left);
            }
            if(poppedNode.right != null){
                q.offer(poppedNode.right);
            }
        }

        return nodesCount;
    }
}
