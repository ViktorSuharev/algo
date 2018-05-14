package com.visu.algo.structure.cache.model;

import com.visu.algo.structure.cache.LruCache;

import java.util.HashMap;
import java.util.Map;

public class LruCacheImpl implements LruCache {

    private final static int DEFAULT_SIZE = 17;

    private final Map<Key, Node> cache;

    private final int size;
    private Node first;
    private Node last;

    public LruCacheImpl() {
        this(DEFAULT_SIZE);
    }

    public LruCacheImpl(int size) {
        // hash map size is bigger than cache size
        this.size = size + 1;
        cache = new HashMap<>(this.size);
    }

    @Override
    public Value get(Key key) {
        Node node = cache.get(key);
        if (node == null) return null;

        removeFromList(node);
        setFirst(node);

        return node.getValue();
    }

    @Override
    public void put(Key key, Value value) {
        Node node = new Node(key, value);
        cache.put(key, node);

        if (cache.size() == 1) {
            first = node;
            last = node;
            return;
        }

        setFirst(node);
        removeLastIfNeeded();
    }

    @Override
    public void clear() {
        cache.clear();
        first = null;
        last = null;
    }

    private void setFirst(Node node) {
        first.setPrev(node);
        node.setNext(first);
        first = node;
    }

    private void removeFromList(Node node) {
        Node prev = node.getPrev();
        Node next = node.getNext();

        if (prev != null) prev.setNext(next);
        if (next != null) next.setPrev(prev);
    }

    private void removeLastIfNeeded() {
        if (cache.size() == size) {
            cache.remove(last.getKey());
            last.getPrev().setNext(null);
        }
    }
}
