package com.visu.algo.structure.heap.list;

import com.visu.algo.structure.heap.Heap;
import com.visu.algo.structure.heap.list.model.HeapNode;
import com.visu.algo.tree.binary.heap.model.Key;

import java.util.ArrayList;
import java.util.List;

public class HeapListImpl implements Heap {

    private List<HeapNode> heap = new ArrayList<>();

    public HeapListImpl() {}

    public HeapListImpl(List<HeapNode> list) {
        buildHeap(list);
    }

    @Override
    public void add(HeapNode node) {
        heap.add(node);
        bubbleUp(heap.size() - 1);
    }

    @Override
    public void delete(HeapNode node) {

    }

    @Override
    public HeapNode getMax() {
        HeapNode max = heap.get(0);
        int lastPos = heap.size() - 1;
        heap.set(0, heap.get(lastPos));
        heap.remove(lastPos);
        bubbleDown(0);

        return max;
    }

    @Override
    public HeapNode find(Key key) {
        return null;
    }

    @Override
    public String toString() {
        return heap.toString();
    }

    private void bubbleUp(int currentPos) {
        int parentPos = (currentPos - 1) / 2;

        if (currentPos <= 0 || getKey(parentPos) > getKey(currentPos)) return;

        swap(parentPos, currentPos);
        bubbleUp(parentPos);
    }

    private void bubbleDown(int current) {
        int leftChildPos = 2 * current + 1;
        int rightChildPos = 2 * current + 2;

        if (leftChildPos > heap.size() - 1 || rightChildPos > heap.size() - 1) return;

        int greatestChildPos = getKey(leftChildPos) > getKey(rightChildPos) ? leftChildPos : rightChildPos;
        if (getKey(greatestChildPos) > getKey(current)) {
            swap(current, greatestChildPos);
            bubbleDown(greatestChildPos);
        }
    }

    private void swap(int a, int b) {
        HeapNode tmp = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, tmp);
    }

    private int getKey(int pos) {
        return heap.get(pos).getKey().getValue();
    }

    private void buildHeap(List<HeapNode> list) {
        heap = list;
        for (int i = heap.size() / 2; i >= 0; --i) {
            bubbleDown(i);
        }
    }
}
