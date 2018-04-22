package com.visu.algo.tree.binary.heap.model;

import com.visu.algo.tree.binary.model.BinaryTreeNode;

public class HeapNode extends BinaryTreeNode {

    private Key key;

    public HeapNode(Key key) {
        super();
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

}
