package com.visu.algo.structure.hash;

import com.visu.algo.structure.hash.model.HashEntry;
import com.visu.algo.structure.hash.model.Key;
import com.visu.algo.structure.hash.model.Value;

public interface HashTable {

    void put(HashEntry entry);

    Value get(Key key);

    boolean delete(HashEntry entry);

    boolean deleteByKey(Key key);

    boolean contains(Key key);
}
