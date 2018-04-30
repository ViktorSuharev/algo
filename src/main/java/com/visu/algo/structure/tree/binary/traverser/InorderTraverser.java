package com.visu.algo.tree.binary.traverser;

import com.visu.algo.tree.binary.model.BinaryTreeNode;

public class InorderTraverser extends AbstractBinaryTreeTraverser implements BinaryTreeTraverser {

    @Override
    public void traverse(BinaryTreeNode tree) {
        if (tree == null) return;

        process(tree.getValue());
        traverse(tree.getLeft());
        traverse(tree.getRight());
    }

}
