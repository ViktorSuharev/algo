package com.visu.algo.structure.tree.binary.traverser;

import com.visu.algo.structure.tree.binary.traverser.model.BinaryTreeNode;

import java.util.Stack;

public class PreorderTraverser extends AbstractBinaryTreeTraverser implements BinaryTreeTraverser {

    private Stack<BinaryTreeNode> nodeStack = new Stack<>();

    @Override
    public void traverse(BinaryTreeNode tree) {
        if (tree == null) return;

        nodeStack.push(tree);

        traverse(tree.getLeft());
        if (!nodeStack.empty()) process(nodeStack.pop().getValue());
        traverse(tree.getRight());
    }

}
