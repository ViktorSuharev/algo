package com.visu.algo.structure.tree.binary;

import com.visu.algo.structure.tree.binary.model.BinaryTreeNode;
import com.visu.algo.structure.heap.list.model.Value;
import com.visu.algo.structure.tree.binary.traverser.BinaryTreeTraverser;
import com.visu.algo.structure.tree.binary.traverser.InorderTraverser;
import com.visu.algo.structure.tree.binary.traverser.PostorderTraverser;
import com.visu.algo.structure.tree.binary.traverser.PreorderTraverser;

public class Main {

    public static void main(String[] args) {
        testInorder();
        System.out.println();
        testPreorder();
        System.out.println();
        testPostorder();
    }

    private static void testInorder() {
        BinaryTreeTraverser traverser = new InorderTraverser();
        BinaryTreeNode tree = buildBinaryTree();
        traverser.traverse(tree);
    }

    private static void testPreorder() {
        BinaryTreeTraverser traverser = new PreorderTraverser();
        BinaryTreeNode tree = buildBinaryTree();
        traverser.traverse(tree);
    }

    private static void testPostorder() {
        BinaryTreeTraverser traverser = new PostorderTraverser();
        BinaryTreeNode tree = buildBinaryTree();
        traverser.traverse(tree);
    }

    private static BinaryTreeNode buildBinaryTree() {
        BinaryTreeNode nodeA = new BinaryTreeNode(new Value("A"));
        BinaryTreeNode nodeB = new BinaryTreeNode(new Value("B"));
        BinaryTreeNode nodeC = new BinaryTreeNode(new Value("C"));
        BinaryTreeNode nodeD = new BinaryTreeNode(new Value("D"));
        BinaryTreeNode nodeE = new BinaryTreeNode(new Value("E"));
        BinaryTreeNode nodeF = new BinaryTreeNode(new Value("F"));
        BinaryTreeNode nodeG = new BinaryTreeNode(new Value("G"));
        BinaryTreeNode nodeH = new BinaryTreeNode(new Value("H"));
        BinaryTreeNode nodeJ = new BinaryTreeNode(new Value("J"));

        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeC);

        nodeB.setLeft(nodeD);

        nodeC.setLeft(nodeE);
        nodeC.setRight(nodeF);

        nodeE.setRight(nodeG);

        nodeF.setLeft(nodeH);
        nodeF.setRight(nodeJ);

        return nodeA;
    }
}
