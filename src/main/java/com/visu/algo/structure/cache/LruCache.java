package com.visu.algo.structure.cache;

import com.visu.algo.structure.cache.model.Key;
import com.visu.algo.structure.cache.model.Value;

public interface LruCache {

    Value get(Key key);

    void put(Key key, Value value);

}
