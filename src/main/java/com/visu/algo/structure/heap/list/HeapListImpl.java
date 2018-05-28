package com.visu.algo.structure.heap.list;

import com.visu.algo.structure.heap.Heap;
import com.visu.algo.structure.heap.list.model.HeapNode;
import com.visu.algo.structure.heap.list.model.key.AbstractKey;
import com.visu.algo.structure.heap.list.model.key.Key;

import java.util.ArrayList;
import java.util.List;

public class HeapListImpl<K extends AbstractKey> implements Heap<K> {

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
    public boolean delete(HeapNode node) {
        for (int i = 0; i < heap.size(); ++i ) {
            if (node.equals(heap.get(i))) {
                heap.remove(i);
                return true;
            }
        }

        return false;
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
    public HeapNode find(HeapNode node) {
        for (int i = 0; i < heap.size(); ++i ) {
            if (node.equals(heap.get(i))) {
                return heap.get(i);
            }
        }

        return null;
    }

    @Override
    public List<HeapNode> toList() {
        return new ArrayList<>(heap);
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public String toString() {
        return heap.toString();
    }

    private void bubbleUp(int currentPos) {
        int parentPos = (currentPos - 1) / 2;

        if (currentPos <= 0 || getKey(parentPos).compareTo(getKey(currentPos)) > 0) return;

        swap(parentPos, currentPos);
        bubbleUp(parentPos);
    }

    private void bubbleDown(int current) {
        int leftChildPos = 2 * current + 1;
        int rightChildPos = 2 * current + 2;

        if (leftChildPos > heap.size() - 1 || rightChildPos > heap.size() - 1) return;

        int greatestChildPos = getKey(leftChildPos).compareTo(getKey(rightChildPos)) > 0 ? leftChildPos : rightChildPos;
        if (getKey(greatestChildPos).compareTo(getKey(current)) > 0) {
            swap(current, greatestChildPos);
            bubbleDown(greatestChildPos);
        }
    }

    private void swap(int a, int b) {
        HeapNode tmp = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, tmp);
    }

    private Key getKey(int pos) {
        return heap.get(pos).getKey();
    }

    private void buildHeap(List<HeapNode> list) {
        heap = list;
        for (int i = heap.size() / 2; i >= 0; --i) {
            bubbleDown(i);
        }
    }
}
