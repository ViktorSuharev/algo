package com.visu.algo.structure.tree.binary.traverser;

import com.visu.algo.structure.tree.binary.traverser.model.BinaryTreeNode;

public class InorderTraverser extends AbstractBinaryTreeTraverser implements BinaryTreeTraverser {

    @Override
    public void traverse(BinaryTreeNode tree) {
        if (tree == null) return;

        process(tree.getValue());
        traverse(tree.getLeft());
        traverse(tree.getRight());
    }

}
