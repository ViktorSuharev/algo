package com.visu.algo.tree.binary.heap;

import com.visu.algo.tree.binary.heap.model.Key;
import com.visu.algo.tree.binary.model.BinaryTreeNode;

public interface Heap {

    void add(BinaryTreeNode node);

    void delete(BinaryTreeNode node);

    BinaryTreeNode getMax();

    BinaryTreeNode find(Key key);
}
