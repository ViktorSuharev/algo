package com.visu.algo.structure.tree.binary.search;

import com.visu.algo.structure.tree.binary.search.model.Key;
import com.visu.algo.structure.tree.binary.search.model.Node;
import com.visu.algo.structure.tree.binary.search.model.Value;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeImplTest {

    private final BinaryTree binaryTree = new BinaryTreeImpl();

    @Before
    public void setUp() {
        Node node1 = createNode("key1", "value1");
        Node node2 = createNode("key2", "value2");
        Node node3 = createNode("key3", "value3");
        Node node4 = createNode("key4", "value4");
        Node node5 = createNode("key5", "value5");

        binaryTree.add(node3);
        binaryTree.add(node2);
        binaryTree.add(node4);
        binaryTree.add(node1);
        binaryTree.add(node5);

    }

    @Test
    public void add() throws Exception {
        Assert.assertNull(binaryTree.find(new Key("key6")));
        Node node6 = createNode("key6", "value6");
        binaryTree.add(node6);
        Assert.assertNotNull(binaryTree.find(new Key("key6")));
    }

    @Test
    public void find() throws Exception {
        Assert.assertNotNull(binaryTree.find(new Key("key1")));
        Assert.assertNull(binaryTree.find(new Key("key6")));
    }

    @Test
    public void delete() throws Exception {
        Assert.assertNotNull(binaryTree.find(new Key("key1")));
        binaryTree.delete(new Key("key1"));
        Assert.assertNull(binaryTree.find(new Key("key6")));
    }

    private static Node createNode(String key, String value) {
        return new Node(new Key(key), new Value(value));
    }
}
