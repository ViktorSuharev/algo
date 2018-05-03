package com.visu.algo.structure.tree.binary.search.bst;

import com.visu.algo.structure.tree.binary.search.BinaryTree;
import com.visu.algo.structure.tree.binary.search.bst.model.Key;
import com.visu.algo.structure.tree.binary.search.bst.model.Node;
import com.visu.algo.structure.tree.binary.search.bst.model.Value;

import java.util.Stack;

public class BinaryTreeImpl implements BinaryTree {

    private Node root;

    @Override
    public void add(Node node) {
        if (root == null) {
            root = node;
            return;
        }

        add(node, root);
    }

    private void add(Node node, Node root) {
        if (node == null) return;

        if (node.getKey().equals(root.getKey())) {
            root.setValue(node.getValue());
        } else if (node.getKey().lessThan(root.getKey())) {
            if (root.getLeft() == null) {
                root.setLeft(node);
                node.setParent(root);
            }
            add(node, root.getLeft());
        } else {
            if (root.getRight() == null) {
                root.setRight(node);
                node.setParent(root);
            }
            add(node, root.getRight());
        }
    }

    @Override
    public Value find(Key key) {
        return find(key, root);
    }

    private Value find(Key key, Node root) {
        if (root == null) return null;

        if (key.equals(root.getKey())) {
            return root.getValue();
        } else if (key.lessThan(root.getKey())) {
            return find(key, root.getLeft());
        } else {
            return find(key, root.getRight());
        }
    }

    @Override
    public boolean delete(Key key) {
        return delete(key, root);
    }

    private boolean delete(Key key, Node root) {
        if (root == null) return false;

        if (key.equals(root.getKey())) {
            return deleteNode(root);
        } else if (key.lessThan(root.getKey())) {
            return delete(key, root.getLeft());
        } else {
            return delete(key, root.getRight());
        }
    }

    private boolean deleteNode(Node node) {
        if (node.getLeft() == null && node.getRight() == null) {
            setParentLink(node, null);
            return true;
        }

        if (node.getLeft() == null) {
            setParentLink(node, node.getLeft());
            return true;
        }

        if (node.getRight() == null) {
            setParentLink(node, node.getRight());
            return true;
        }

        if (node.getRight().getLeft() == null) {
            setParentLink(node, node.getRight());
            return true;
        } else {
            Node leftest = getLeftest(node.getRight());

            node.setKey(leftest.getKey());
            node.setValue(leftest.getValue());

            return deleteNode(leftest);
        }
    }

    private void setParentLink(Node node, Node link) {
        if (node == root) {
            root = link;
            return;
        }

        Node parent = node.getParent();
        if (parent.getLeft() != null && node.getKey().equals(parent.getLeft().getKey())) {
            parent.setLeft(link);
        } else {
            parent.setRight(link);
        }
    }

    private Node getLeftest(Node root) {
        if (root.getLeft() == null) return root;

        return getLeftest(root.getLeft());
    }

    private void rotateLeft(Node root) {
        Node left = root.getLeft();
        Node right = root.getRight();
        Node parent = root.getParent();

        if (parent == null) {

        }
    }

    private void rotateRight() {

    }
}
