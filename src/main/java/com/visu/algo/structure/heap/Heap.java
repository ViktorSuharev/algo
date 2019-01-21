package com.visu.algo.structure.heap;

import com.visu.algo.structure.heap.list.model.HeapNode;

import java.util.List;

public interface Heap<K> {

    void add(HeapNode node);

    boolean delete(HeapNode node);

    HeapNode getMax();

    HeapNode find(HeapNode node);

    List<HeapNode> toList();

    int size();
}
