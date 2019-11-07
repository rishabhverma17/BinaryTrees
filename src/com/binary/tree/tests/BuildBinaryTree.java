package com.binary.tree.tests;

import com.binary.tree.traversal.TreeNode;

public class BuildBinaryTree {
    private TreeNode myTreeNode = null;

    public void buildtree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
        root.right.right = new TreeNode(6);

        myTreeNode = root;
    }

    public TreeNode getMyTreeNode() {
        return myTreeNode;
    }
}
