package com.binary.tree.traversal;

import java.util.Stack;

public class PostOrderTraversal {
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        else{
            Stack<TreeNode> st1 = new Stack<>();
            Stack<TreeNode> st2 = new Stack<>();
            TreeNode node = root;
            while(node != null || !st1.isEmpty()){
                if(node != null){
                    st2.push(node);
                    st1.push(node);
                    node = node.right;
                }
                else{
                    node = st1.pop();
                    node = node.left;
                }
            }

            /* Printing all the elements */
            //System.out.println("==== Post Order Traversal ====");
            while(!st2.isEmpty()){
                TreeNode tmpNode = st2.pop();
                System.out.print(tmpNode.value+" ");
            }
            System.out.println("");
        }
    }

}
