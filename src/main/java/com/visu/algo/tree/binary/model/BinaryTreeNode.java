package com.visu.algo.tree.binary.model;

public class BinaryTreeNode {

    private Object value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode() {}

    public BinaryTreeNode(Value value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
