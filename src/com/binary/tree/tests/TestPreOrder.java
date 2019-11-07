package com.binary.tree.tests;

import com.binary.tree.traversal.PreOrderTraversal;
import com.binary.tree.traversal.TreeNode;

public class TestPreOrder extends BuildBinaryTree {
    public void testPostOrder(){
        BuildBinaryTree bt = new BuildBinaryTree();
        bt.buildtree();
        TreeNode root = bt.getMyTreeNode();
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.preOrder(root);
    }
}
