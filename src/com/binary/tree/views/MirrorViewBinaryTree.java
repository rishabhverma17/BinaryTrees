package com.binary.tree.views;

import com.binary.tree.traversal.BuildTree;
import com.binary.tree.traversal.InOrderTraversal;
import com.binary.tree.traversal.TreeNode;

public class MirrorViewBinaryTree {
    public void printMirrorView(){
        BuildTree bt = new BuildTree();
        TreeNode node = bt.getTreeType2();
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        System.out.println("In Order for current tree");
        inOrderTraversal.inOrder(node);
        System.out.println();
        printMirror(node);
        System.out.println("Mirror View");
        inOrderTraversal.inOrder(node);
    }

    private void printMirror(TreeNode root){
        if(root == null){
            return;
        }
        else{
            /* Post Order Traversal [ LEFT_NODE | RIGHT_NODE | ROOT_VALUE ] */
            printMirror(root.left);
            printMirror(root.right);
            TreeNode tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;
        }
    }
}
