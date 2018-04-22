package com.visu.algo.structure.heap.list;

import com.visu.algo.structure.heap.Heap;
import com.visu.algo.structure.heap.list.model.HeapNode;
import com.visu.algo.tree.binary.heap.model.Key;
import com.visu.algo.tree.binary.model.Value;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HeapListImplTest {

    private Heap heap = new HeapListImpl();

    @Before
    public void setUp() {
        heap.add(createHeapNode(10, "A"));
        heap.add(createHeapNode(20, "B"));
        heap.add(createHeapNode(30, "C"));
        heap.add(createHeapNode(40, "D"));
        heap.add(createHeapNode(50, "E"));
        heap.add(createHeapNode(60, "F"));
        heap.add(createHeapNode(70, "G"));
        heap.add(createHeapNode(80, "H"));
        heap.add(createHeapNode(90, "I"));
        heap.add(createHeapNode(100, "J"));

        System.out.println(heap);
    }

    @After
    public void destroy() {
        heap = null;
    }

    private static HeapNode createHeapNode(int key, String value) {
        return new HeapNode(new Key(key), new Value(value));
    }

    @Test
    public void add() throws Exception {
        heap.add(createHeapNode(95, "X"));
        heap.getMax();
        Assert.assertEquals(createHeapNode(95, "X"), heap.getMax());
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void getMax() throws Exception {
        Assert.assertEquals(createHeapNode(100, "J"), heap.getMax());
    }

    @Test
    public void find() throws Exception {
    }
}
