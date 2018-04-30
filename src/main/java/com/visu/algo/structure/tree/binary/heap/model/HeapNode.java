package com.visu.algo.structure.tree.binary.heap.model;

import com.visu.algo.structure.heap.list.model.Key;

public class HeapNode extends BinaryTreeNode {

    private Key key;
    private HeapNode parent;

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
