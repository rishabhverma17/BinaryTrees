package com.binary.tree.traversal;

public class BoundaryTraversal {
    public void printBoundaryBinaryTree(){
        // Left Nodes (Except Leaf) + (Leaf Nodes) + Right Nodes (Reverse Order, Except Root)
        // Catch : Do not print any node twice.
        BuildTree bt = new BuildTree();
        TreeNode root = bt.getTreeType2();
        printLeftNodes(root);
        printLeafNodes(root);
        printRightReverse(root.right);
    }

    private void printLeftNodes(TreeNode root){
        TreeNode node = root;
        if(node == null){
            return;
        }
        else if( node.left == null && node.right == null){
            return;
        }
        else{
            System.out.print(node.value+" ");
            printLeftNodes(node.left);
        }
    }

    private void printLeafNodes(TreeNode root){
        TreeNode node = root;
        if(node == null){
            return;
        }
        else if(node.left == null && node.right == null)
        {
            System.out.print(node.value+" ");
        }
        else{
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }

    private void printRightReverse(TreeNode root){
        TreeNode node = root;
        if(node == null){
            return;
        }
        else if(node.left == null && node.right == null){
            return;
        }
        else{
            printRightReverse(node.right);
            System.out.print(node.value+" ");
        }
    }
}
