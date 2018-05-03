package com.visu.algo.structure.tree.binary.search;

import com.visu.algo.structure.tree.binary.search.bst.model.Key;
import com.visu.algo.structure.tree.binary.search.bst.model.Node;
import com.visu.algo.structure.tree.binary.search.bst.model.Value;

public interface BinaryTree {

    void add(Node node);

    Value find(Key key);

    boolean delete(Key key);
}
