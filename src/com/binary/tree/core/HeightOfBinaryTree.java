package com.binary.tree.core;

import com.binary.tree.traversal.BuildTree;
import com.binary.tree.traversal.TreeNode;

public class HeightOfBinaryTree {
    public void getHeight(){
        BuildTree bt = new BuildTree();
        TreeNode root = bt.getTreeType2();
        int height = binaryTreeHeight(root);
        System.out.println("\nHeight Of binary tree is : "+height);
    }

    private int binaryTreeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            int heightOfLeftChild = binaryTreeHeight(root.left);
            int heightOfRightChild = binaryTreeHeight(root.right);
            return 1 + Math.max(heightOfLeftChild,heightOfRightChild);
        }
    }
}
