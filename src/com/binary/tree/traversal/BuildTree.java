package com.binary.tree.traversal;

public class BuildTree {
    public TreeNode getTreeType1(){

     /*                  1
                        / \
                       2   3
                      / \   \
                     4   5   8
                    /     \   \
                   6       7   9
      */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        return root;
    }
    public TreeNode getTreeType2(){

     /*                  1
                        / \
                       2   3
                      / \   \
                     4   5   8
                          \   \
                           7   9
                          /
                         6
      */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(7);
        root.left.right.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        return root;
    }
}
