package com.visu.algo.structure.heap;

import java.util.ArrayList;
import java.util.List;

public class ArrayHeap implements Heap {

    private List<ThreeNode> heap = new ArrayList<>();

    @Override
    public void add(ThreeNode elem) {
        heap.add(elem);
    }

    @Override
    public boolean contains(ThreeNode elem) {
        return false;
    }

    @Override
    public void delete(ThreeNode elem) {

    }

    private void swap() {

    }
}
