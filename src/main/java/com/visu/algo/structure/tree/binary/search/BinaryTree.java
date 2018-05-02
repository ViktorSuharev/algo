package com.visu.algo.structure.tree.binary.search;

import com.visu.algo.structure.tree.binary.search.model.Key;
import com.visu.algo.structure.tree.binary.search.model.Node;
import com.visu.algo.structure.tree.binary.search.model.Value;

public interface BinaryTree {

    void add(Node node);

    Value find(Key key);

    boolean delete(Key key);
}
