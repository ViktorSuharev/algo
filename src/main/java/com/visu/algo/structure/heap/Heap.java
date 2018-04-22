package com.visu.algo.structure.heap;

import com.visu.algo.structure.heap.list.model.HeapNode;
import com.visu.algo.tree.binary.heap.model.Key;

public interface Heap {

    void add(HeapNode node);

    void delete(HeapNode node);

    HeapNode getMax();

    HeapNode find(Key key);
}
