package com.visu.algo.structure.tree.binary.search.bst;

import com.visu.algo.structure.tree.binary.search.BinaryTree;
import com.visu.algo.structure.tree.binary.search.bst.model.Key;
import com.visu.algo.structure.tree.binary.search.bst.model.Node;
import com.visu.algo.structure.tree.binary.search.bst.model.Value;
import com.visu.algo.structure.tree.binary.traverser.AbstractBinaryTreeTraverser;
import com.visu.algo.structure.tree.binary.traverser.BinaryTreeTraverser;
import com.visu.algo.structure.tree.binary.traverser.model.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class BinaryTreeImplTest {

    private final BinaryTree binaryTree = new BinaryTreeImpl();

/**
            5
          /  \
        2     6
      /   \    \
     1     4    7
          /
         3
 */

    @Before
    public void setUp() {
        Node node1 = createNode("key1", "value1");
        Node node2 = createNode("key2", "value2");
        Node node3 = createNode("key3", "value3");
        Node node4 = createNode("key4", "value4");
        Node node5 = createNode("key5", "value5");
        Node node6 = createNode("key6", "value6");
        Node node7 = createNode("key7", "value7");

        binaryTree.add(node5);
        binaryTree.add(node2);
        binaryTree.add(node6);
        binaryTree.add(node1);
        binaryTree.add(node4);
        binaryTree.add(node7);
        binaryTree.add(node3);

    }

    @Test
    public void add() throws Exception {
        Assert.assertNull(binaryTree.find(new Key("keyX")));
        Node node6 = createNode("keyX", "valueX");
        binaryTree.add(node6);
        Assert.assertNotNull(binaryTree.find(new Key("keyX")));
    }

    @Test
    public void find() throws Exception {
        Assert.assertNotNull(binaryTree.find(new Key("key1")));
        Assert.assertNull(binaryTree.find(new Key("keyX")));
    }

    @Test
    public void delete_nodeWithoutChildren() throws Exception {
        Assert.assertNotNull(binaryTree.find(new Key("key1")));
        binaryTree.delete(new Key("key1"));
        Assert.assertNull(binaryTree.find(new Key("key1")));
    }


    @Test
    public void delete_nodeWithLeftChild() throws Exception {
        Assert.assertNotNull(binaryTree.find(new Key("key4")));
        binaryTree.delete(new Key("key4"));
        Assert.assertNull(binaryTree.find(new Key("key4")));
    }

    @Test
    public void delete_nodeWithRightChild() throws Exception {
        Assert.assertNotNull(binaryTree.find(new Key("key6")));
        binaryTree.delete(new Key("key6"));
        Assert.assertNull(binaryTree.find(new Key("key6")));
    }

    @Test
    public void delete_nodeWithBothChildren() throws Exception {
        Assert.assertNotNull(binaryTree.find(new Key("key2")));
        binaryTree.delete(new Key("key2"));
        Assert.assertNull(binaryTree.find(new Key("key2")));
    }

    @Test
    public void delete_root() throws Exception {
        Assert.assertNotNull(binaryTree.find(new Key("key5")));
        binaryTree.delete(new Key("key5"));
        Assert.assertNull(binaryTree.find(new Key("key5")));
    }

    private static Node createNode(String key, String value) {
        return new Node(new Key(key), new Value(value));
    }
}
