package com.binary.tree.traversal;

import java.util.Stack;

public class PreOrderTraversal {
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        else{
            Stack<TreeNode> st = new Stack<>();
            TreeNode node = root;
            while(node != null || !st.isEmpty()){
                if(node != null){
                    System.out.print(node.value+" ");
                    st.push(node);
                    node = node.left;
                }
                else{
                    node = st.pop();
                    node = node.right;
                }
            }
        }
    }
}
