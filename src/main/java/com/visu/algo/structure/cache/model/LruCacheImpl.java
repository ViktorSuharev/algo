package com.visu.algo.structure.cache.model;

import com.visu.algo.structure.cache.LruCache;

import java.util.HashMap;
import java.util.Map;

public class LruCacheImpl implements LruCache {

    private final static int DEFAULT_SIZE = 16;

    private final Map<Key, Value> cache;

    private final int size;
    private Node first;
    private Node last;

    public LruCacheImpl() {
        this(DEFAULT_SIZE);
    }

    public LruCacheImpl(int size) {
        this.size = size;
        cache = new HashMap<>(size);
    }

    @Override
    public Value get(Key key) {
        Value value = cache.get(key);


        return value;
    }

    @Override
    public void put(Key key, Value value) {
        Node node = new Node(key, value);
        first.setPrev(node);
        first = node;
        cache.put(key, value);
        if (cache.size() > size) {
            cache.remove(last.getKey());
            last.getPrev().setNext(null);
        }
    }
}
