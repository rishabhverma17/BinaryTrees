package com.binary.tree.tests;

import com.binary.tree.traversal.InOrderTraversal;
import com.binary.tree.traversal.TreeNode;

public class TestInOrder {
    public void testInOrder(){
        BuildBinaryTree bt = new BuildBinaryTree();
        bt.buildtree();
        TreeNode root = bt.getMyTreeNode();

        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.inOrder(root);
    }
}
