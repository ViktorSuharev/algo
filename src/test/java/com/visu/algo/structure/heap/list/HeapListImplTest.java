package com.visu.algo.structure.heap.list;

import com.visu.algo.structure.heap.Heap;
import com.visu.algo.structure.heap.list.model.HeapNode;
import com.visu.algo.structure.heap.list.model.Key;
import com.visu.algo.structure.heap.list.model.Value;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
    }

    @After
    public void destroy() {
        heap = null;
    }

    private static HeapNode createHeapNode(int key, String value) {
        return new HeapNode(new Key(key), new Value(value));
    }

    @Test
    public void checkHeapCondition() throws Exception {
        assertHeapCondition(heap);
    }

    private void assertHeapCondition(Heap heap) {
        List<HeapNode> list = heap.toList();
        int prev = list.get(0).getKey().getValue();
        for (int i = 1; i < list.size(); ++i) {
            int current = list.get(0).getKey().getValue();
            Assert.assertTrue(prev >= current);
            prev = current;
        }
    }

    @Test
    public void add() throws Exception {
        Assert.assertEquals(10, heap.size());
        heap.add(createHeapNode(95, "X"));
        assertHeapCondition(heap);
        Assert.assertEquals(11, heap.size());
    }

    @Test
    public void delete() throws Exception {
        Assert.assertEquals(10, heap.size());
        Assert.assertTrue(heap.delete(createHeapNode(50, "E")));
        assertHeapCondition(heap);
        Assert.assertEquals(9, heap.size());
    }

    @Test
    public void delete_nonExistent() throws Exception {
        Assert.assertEquals(10, heap.size());
        Assert.assertFalse(heap.delete(createHeapNode(500, "EE")));
        assertHeapCondition(heap);
        Assert.assertEquals(10, heap.size());
    }

    @Test
    public void getMax() throws Exception {
        Assert.assertEquals(10, heap.size());
        Assert.assertEquals(createHeapNode(100, "J"), heap.getMax());
        assertHeapCondition(heap);
        Assert.assertEquals(9, heap.size());
    }

    @Test
    public void find() throws Exception {
        Assert.assertEquals(10, heap.size());
        Assert.assertNotNull(heap.find(createHeapNode(50, "E")));
        assertHeapCondition(heap);
        Assert.assertEquals(10, heap.size());
    }

    @Test
    public void find_nonExistent() throws Exception {
        Assert.assertEquals(10, heap.size());
        Assert.assertNull(heap.find(createHeapNode(500, "EE")));
        assertHeapCondition(heap);
        Assert.assertEquals(10, heap.size());
    }
}
