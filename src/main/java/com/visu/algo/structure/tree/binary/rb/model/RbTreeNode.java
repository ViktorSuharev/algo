package com.visu.algo.structure.tree.binary.rb.model;

import com.visu.algo.structure.heap.list.model.Value;

public class RbTreeNode {

    private Key key;
    private Value value;
    private boolean isBlack;

    private RbTreeNode left;
    private RbTreeNode right;

    public RbTreeNode() {}

    public RbTreeNode(Value value) {
        this.value = value;
    }

    public RbTreeNode getLeft() {
        return left;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setLeft(RbTreeNode left) {
        this.left = left;
    }

    public RbTreeNode getRight() {
        return right;
    }

    public void setRight(RbTreeNode right) {
        this.right = right;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }


}
