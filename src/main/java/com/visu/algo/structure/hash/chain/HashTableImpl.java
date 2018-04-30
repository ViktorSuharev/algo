package com.visu.algo.structure.hash.chain;

import com.visu.algo.structure.hash.HashTable;
import com.visu.algo.structure.hash.hashcode.HashFunction;
import com.visu.algo.structure.hash.model.Node;
import com.visu.algo.structure.hash.model.Key;
import com.visu.algo.structure.hash.model.Value;

import java.util.ArrayList;
import java.util.List;

public class HashTableImpl implements HashTable {

    private final static int DEFAULT_INITIAL_CAPACITY = 16;
    private final static float LOAD_FACTOR = 0.75f;

    private final int initialCapacity;
    private int capacity;
    private int count;
    private List<Node>[] buckets;

    public HashTableImpl() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public HashTableImpl(int capacity) {
        this.initialCapacity = capacity;
        this.capacity = capacity;
        this.count = 0;
        this.buckets = new List[capacity];
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 32; ++i)
            System.out.println(i + " : " + HashFunction.hashCode(new Key("key" + i)) % 16);
    }

    @Override
    public boolean put(Node entry) {
        Key key = entry.getKey();

        resizeIfNeeded(true);

        List<Node> bucket = getBuckets(key);
        if (bucket == null) {
            bucket = new ArrayList<>();
            buckets[getHashCode(key)] = bucket;
        }

        Node storedEntry = findEntryByKey(bucket, entry.getKey());
        if (storedEntry != null) {
            storedEntry.setValue(entry.getValue());
            return true;
        }

        boolean result = bucket.add(entry);
        if (result) count++;

        return result;
    }

    @Override
    public Value get(Key key) {
        List<Node> bucket = getBuckets(key);
        if (bucket == null || bucket.isEmpty()) return null;

        return findEntryByKey(bucket, key)
                .getValue();
    }

    @Override
    public boolean delete(Node entry) {
        Key key = entry.getKey();

        resizeIfNeeded(false);

        List<Node> bucket = getBuckets(key);

        boolean result = bucket.remove(entry);
        if (result) count--;

        return result;
    }

    @Override
    public boolean deleteByKey(Key key) {
        resizeIfNeeded(false);

        List<Node> bucket = getBuckets(key);

        if (isNullOrEmpty(bucket)) return false;

        boolean result = bucket.remove(findEntryByKey(bucket, key));
        if (result) count--;

        return result;
    }

    @Override
    public boolean contains(Key key) {
        List<Node> bucket = getBuckets(key);

        return !isNullOrEmpty(bucket) && findEntryByKey(bucket, key) != null;
    }

    @Override
    public void clear() {
        buckets = new List[initialCapacity];
    }

    private void resizeIfNeeded(boolean up) {
        if (isNeededToResize(up)) {
            resize();
        }
    }

    private boolean isNeededToResize(boolean up) {
        int bit = up ? 1 : -1;
        return ((float) ((count + bit) / capacity)) >= LOAD_FACTOR;
    }

    private void resize() {
        List<Node>[] oldBuckets = new List[capacity];
        System.arraycopy(buckets, 0, oldBuckets, 0, buckets.length);

        capacity = 2 * count;
        buckets = new List[capacity];

        for (List<Node> oldBucket : oldBuckets) {
            if (oldBucket == null) continue;
            for (Node entry : oldBucket) {
                put(entry);
            }
        }
    }

    private List<Node> getBuckets(Key key) {
        int index = getHashCode(key);
        return buckets[index];
    }

    private int getHashCode(Key key) {
        return HashFunction.hashCode(key) % capacity;
    }

    private Node findEntryByKey(List<Node> bucket, Key key) {
        for(Node entry : bucket) {
            if (key.equals(entry.getKey())) {
                return entry;
            }
        }

        return null;
    }

    private boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }

}
