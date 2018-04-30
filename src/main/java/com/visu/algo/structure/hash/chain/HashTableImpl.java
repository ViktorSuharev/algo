package com.visu.algo.structure.hash.closed;

import com.visu.algo.structure.hash.HashTable;
import com.visu.algo.structure.hash.hashcode.HashFunction;
import com.visu.algo.structure.hash.model.HashEntry;
import com.visu.algo.structure.hash.model.Key;
import com.visu.algo.structure.hash.model.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTableImpl implements HashTable {

    private final static int DEFAULT_INITIAL_CAPACITY = 100;
    private final static float LOAD_FACTOR = 0.75f;

    private int capacity;
    private List<List<HashEntry>> buckets;

    public HashTableImpl() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public HashTableImpl(int capacity) {
        this.capacity = capacity;
        buckets = new ArrayList<>(capacity);
    }

    @Override
    public void put(HashEntry entry) {
        Key key = entry.getKey();

        List<HashEntry> segment = getBuckets(key);
        if (segment == null) {
            segment = new ArrayList<>();
        }

        segment.add(entry);
    }

    @Override
    public Value get(Key key) {
        List<HashEntry> buckets = getBuckets(key);
        if (buckets == null || buckets.isEmpty()) return null;

        return findEntryByKey(buckets, key)
                .getValue();
    }

    @Override
    public boolean delete(HashEntry entry) {
        Key key = entry.getKey();

        List<HashEntry> buckets = getBuckets(key);
        return buckets.remove(entry);
    }

    @Override
    public boolean deleteByKey(Key key) {
        List<HashEntry> buckets = getBuckets(key);

        return !isNullOrEmpty(buckets) && buckets.remove(findEntryByKey(buckets, key));
    }

    @Override
    public boolean contains(Key key) {
        List<HashEntry> buckets = getBuckets(key);

        return !isNullOrEmpty(buckets) && findEntryByKey(buckets, key) != null;
    }

    private List<HashEntry> getBuckets(Key key) {
        int index = HashFunction.hashCode(key) % capacity;
        return buckets.get(index);
    }

    private HashEntry findEntryByKey(List<HashEntry> buckets, Key key) {
        return buckets.stream()
                .filter(e -> key.equals(e.getKey()))
                .findFirst()
                .orElse(null);
    }

    private boolean isNullOrEmpty(List list) {
        return list == null || list.isEmpty();
    }

    public static void main(String[] args) {

        List<String> buckets = Arrays.asList("str1", "str2", "str3");

        String result = buckets.stream()
                .filter("str4"::equals)
                .findFirst().get();

        System.out.println(result);
    }
}
