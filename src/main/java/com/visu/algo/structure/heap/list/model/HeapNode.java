package com.visu.algo.structure.heap.list.model;

import com.visu.algo.structure.heap.list.model.key.AbstractKey;

public class HeapNode<K extends AbstractKey, V> {

    private K key;
    private V value;

    public HeapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeapNode heapNode = (HeapNode) o;

        if (key != null ? !key.equals(heapNode.key) : heapNode.key != null) return false;
        return value != null ? value.equals(heapNode.value) : heapNode.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "(" + key + " : " + value + ")";
    }
}
