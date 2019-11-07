package com.binary.tree.traversal;

import java.util.Stack;

public class SpiralOrderTraversal {
    public void printSpiral(){
        BuildTree bt = new BuildTree();
        TreeNode root = bt.getTreeType1();

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.push(root);

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            while (!stack1.isEmpty()){
                TreeNode node = stack1.pop();
                System.out.print(node.value+" ");
                if(node.left != null){
                    stack2.push(node.left);
                }
                if(node.right != null){
                    stack2.push(node.right);
                }
            }
            while (!stack2.isEmpty()){
                TreeNode node = stack2.pop();
                System.out.print(node.value+" ");
                if(node.right != null){
                    stack1.push(node.right);
                }
                if(node.left != null){
                    stack1.push(node.left);
                }
            }
        }
    }
}
