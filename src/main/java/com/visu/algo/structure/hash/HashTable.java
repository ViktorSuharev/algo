package com.visu.algo.structure.hash;

import com.visu.algo.structure.hash.model.Node;
import com.visu.algo.structure.hash.model.Key;
import com.visu.algo.structure.hash.model.Value;

public interface HashTable {

    boolean put(Node entry);

    Value get(Key key);

    boolean delete(Node entry);

    boolean deleteByKey(Key key);

    boolean contains(Key key);

    void clear();
}
