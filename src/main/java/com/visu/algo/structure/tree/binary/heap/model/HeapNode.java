package com.visu.algo.structure.tree.binary.heap.model;

import com.visu.algo.structure.heap.list.model.key.KeyImpl;

public class HeapNode extends BinaryTreeNode {

    private KeyImpl keyImpl;
    private HeapNode parent;

    public HeapNode(KeyImpl keyImpl) {
        super();
        this.keyImpl = keyImpl;
    }

    public KeyImpl getKeyImpl() {
        return keyImpl;
    }

    public void setKeyImpl(KeyImpl keyImpl) {
        this.keyImpl = keyImpl;
    }

}
