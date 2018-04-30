package com.visu.algo.structure.tree.binary.rb;

import com.visu.algo.structure.hash.model.Key;
import com.visu.algo.structure.tree.binary.rb.model.RbTreeNode;
import com.visu.algo.structure.tree.binary.rb.model.Value;

public interface RbTree {

    void add(RbTreeNode node);

    void delete(RbTreeNode node);

    Value find(Key key);
}
