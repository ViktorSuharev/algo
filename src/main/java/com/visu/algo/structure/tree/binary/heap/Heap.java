package com.visu.algo.structure.tree.binary.heap;

import com.visu.algo.structure.tree.binary.heap.model.HeapNode;

import java.util.List;

public interface Heap {

    void add(HeapNode node);

    boolean delete(HeapNode node);

    HeapNode getMax();

    HeapNode find(HeapNode node);

    List<HeapNode> toList();

    int size();
}
