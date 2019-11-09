package com.binary.tree.core;

import com.binary.tree.traversal.BuildTree;
import com.binary.tree.traversal.TreeNode;

import java.util.ArrayList;

public class PrintAllPath {
    ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> solve() {
        BuildTree bt = new BuildTree();
        TreeNode root = bt.getTreeType2();
        if(root == null){
            return paths;
        }
        inorder(root,new ArrayList<>());
        return paths;
    }

    private void inorder(TreeNode root, ArrayList<Integer> path){
        path.add(root.value);
        if(root.left != null){
            inorder(root.left,path);
        }
        if(root.left == null && root.right == null){
            // Copy is required as List holds the object and deletion in path is reflected paths as well
            // DeepCopy and Shallow Copy
            ArrayList<Integer> toAdd = (ArrayList<Integer>) path.clone();
            paths.add(toAdd);
        }
        if(root.right != null){
            inorder(root.right,path);
        }
        path.remove(path.size()-1);
    }
}
