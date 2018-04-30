package com.visu.algo.structure.tree.binary.rb;

import com.visu.algo.structure.hash.model.Key;
import com.visu.algo.structure.tree.binary.rb.model.RbTreeNode;
import com.visu.algo.structure.tree.binary.rb.model.Value;

public class RbTreeImpl implements RbTree {

    private RbTreeNode root;

    @Override
    public void add(RbTreeNode node) {
        if (root == null) {
            root = node;
            root.setBlack(true);
        }

        
    }

    @Override
    public void delete(RbTreeNode node) {

    }

    @Override
    public Value find(Key key) {
        return null;
    }
}
