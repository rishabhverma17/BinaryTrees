package com.binary.tree.traversal;

import java.util.Stack;

public class InOrderTraversal {
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        else{
            Stack<TreeNode> st = new Stack<>();
            TreeNode node = root;
            while(node != null || !st.isEmpty()){
                if(node != null){
                    st.push(node);
                    node = node.left;
                }
                else{
                    node = st.pop();
                    System.out.print(node.value+" ");
                    node = node.right;
                }
            }
        }
    }
}
