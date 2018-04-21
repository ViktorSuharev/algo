package com.visu.algo.tree.binary.traverser;

import com.visu.algo.tree.binary.model.BinaryTree;
import com.visu.algo.tree.binary.model.Value;

public class Main {

    public static void main(String[] args) {
        BinaryTreeTraverser traverser = new InorderTraverser();

        BinaryTree tree = buildBinaryTree();
        traverser.traverse(tree);
    }

    public static BinaryTree buildBinaryTree() {
        BinaryTree nodeA = new BinaryTree(new Value("A"));
        BinaryTree nodeB = new BinaryTree(new Value("B"));
        BinaryTree nodeC = new BinaryTree(new Value("C"));
        BinaryTree nodeD = new BinaryTree(new Value("D"));
        BinaryTree nodeE = new BinaryTree(new Value("E"));
        BinaryTree nodeG = new BinaryTree(new Value("F"));
        BinaryTree nodeF = new BinaryTree(new Value("G"));
        BinaryTree nodeH = new BinaryTree(new Value("H"));
        BinaryTree nodeJ = new BinaryTree(new Value("J"));

        nodeA.setLeft(nodeB);
        nodeA.setRight(nodeC);

        nodeB.setLeft(nodeD);

        nodeC.setLeft(nodeE);
        nodeD.setRight(nodeF);

        nodeE.setRight(nodeG);

        nodeF.setLeft(nodeH);
        nodeF.setRight(nodeJ);

        return nodeA;
    }
}
