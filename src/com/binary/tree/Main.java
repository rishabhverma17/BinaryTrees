package com.binary.tree;

import com.binary.tree.core.CountNodes;
import com.binary.tree.core.HeightOfBinaryTree;
import com.binary.tree.core.PrintAllPath;
import com.binary.tree.tests.TestInOrder;
import com.binary.tree.tests.TestPostOrder;
import com.binary.tree.tests.TestPreOrder;
import com.binary.tree.traversal.BoundaryTraversal;
import com.binary.tree.traversal.LevelOrderTraversal;
import com.binary.tree.traversal.SpiralOrderTraversal;
import com.binary.tree.traversal.VerticalOrderTraversal;
import com.binary.tree.views.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.print("==== InOrder Traversal ====\n");
        TestInOrder inOrder = new TestInOrder();
        inOrder.testInOrder();

        System.out.print("\n==== PreOrder Traversal ====\n");
        TestPreOrder preOrder = new TestPreOrder();
        preOrder.testPostOrder();

        System.out.print("\n==== Post Order Traversal ====\n");
        TestPostOrder postOrder = new TestPostOrder();
        postOrder.testPostOrder();

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrder();

        System.out.println("\n==== Vertical Order Traversal ====");
        VerticalOrderTraversal verticalOrderTraversal = new VerticalOrderTraversal();
        verticalOrderTraversal.verticalOrder();

        System.out.println("\n==== Top View Of Binary Tree ====");
        TopView topView = new TopView();
        topView.topViewBinarytree();

        System.out.println("\n==== Bottom View Of Binary Tree ====");
        BottomView bottomView = new BottomView();
        bottomView.bottomViewTree();

        System.out.println("\n==== Left View Of Binary Tree ====");
        LeftView leftView = new LeftView();
        leftView.leftView();

        System.out.println("\n==== Right View Of Binary Tree ====");
        RightView rightView = new RightView();
        rightView.rightView();

        System.out.println("\n==== Boundary Traversal Of Binary Tree ====");
        BoundaryTraversal boundaryTraversal = new BoundaryTraversal();
        boundaryTraversal.printBoundaryBinaryTree();

        System.out.println("\n==== Mirror View Of Binary Tree ====");
        MirrorViewBinaryTree mirrorViewBinaryTree = new MirrorViewBinaryTree();
        mirrorViewBinaryTree.printMirrorView();

        System.out.println("\n==== Spiral Order Traversal Of Binary Tree ====");
        SpiralOrderTraversal spiralOrderTraversal = new SpiralOrderTraversal();
        spiralOrderTraversal.printSpiral();

        System.out.println("\n==== Diagonal View Of Binary Tree ====");
        DiagonalView diagonalView = new DiagonalView();
        diagonalView.printDiagonalView();

        System.out.println("\n==== Height Of Binary Tree ====");
        HeightOfBinaryTree heightOfBinaryTree = new HeightOfBinaryTree();
        heightOfBinaryTree.getHeight();

        System.out.println("\n==== Print All Path Of Binary Tree ====");
        PrintAllPath printAllPath = new PrintAllPath();
        ArrayList<ArrayList<Integer>> allPathBinaryTree = printAllPath.solve();
        for(ArrayList list : allPathBinaryTree){
            System.out.println(list);
        }

        System.out.println("\n==== Count of Nodes in Binary Tree ====");
        CountNodes countNodes = new CountNodes();
        countNodes.countNodesInBinaryTree();
    }
}
