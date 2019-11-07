package com.binary.tree.tests;

import com.binary.tree.traversal.PostOrderTraversal;
import com.binary.tree.traversal.TreeNode;

public class TestPostOrder {
    public void testPostOrder(){
        BuildBinaryTree bt = new BuildBinaryTree();
        bt.buildtree();
        TreeNode root = bt.getMyTreeNode();

        PostOrderTraversal traversal = new PostOrderTraversal();
        traversal.postOrder(root);
    }
}
