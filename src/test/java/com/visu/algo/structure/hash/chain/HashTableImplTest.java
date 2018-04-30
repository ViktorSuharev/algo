package com.visu.algo.structure.hash.chain;

import com.visu.algo.structure.hash.HashTable;
import com.visu.algo.structure.hash.model.Node;
import com.visu.algo.structure.hash.model.Key;
import com.visu.algo.structure.hash.model.Value;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableImplTest {

    private HashTable hashTable = new HashTableImpl();

    @Before
    public void setUp() {
        hashTable.clear();

        hashTable.put(createEntry("key1", "value1"));
        hashTable.put(createEntry("key2", "value2"));
        hashTable.put(createEntry("key3", "value3"));
    }

    @Test
    public void testPut_withoutCollision() throws Exception {
        Key key = new Key("key4");
        Assert.assertFalse(hashTable.contains(key));
        hashTable.put(createEntry("key4", "value4"));
        Assert.assertTrue(hashTable.contains(key));
    }

    @Test
    public void testPut_withCollisionAndResize() throws Exception {
        for (int i = 4; i < 32; ++i) {
            Assert.assertFalse(hashTable.contains(new Key("key" + i)));
            hashTable.put(createEntry("key" + i, "value" + i));
        }

        for (int i = 4; i < 32; ++i) {
            Assert.assertTrue(hashTable.contains(new Key("key" + i)));
        }
    }

    @Test
    public void testGet() throws Exception {
        Assert.assertNotNull(hashTable.get(new Key("key1")));
    }

    @Test
    public void testGet_withCollision() throws Exception {
        for (int i = 4; i < 32; ++i) {
            Assert.assertFalse(hashTable.contains(new Key("key" + i)));
            hashTable.put(createEntry("key" + i, "value" + i));
        }

        for (int i = 4; i < 32; ++i) {
            Assert.assertNotNull(hashTable.get(new Key("key" + i)));
        }
    }

    @Test
    public void testDelete() throws Exception {
        Assert.assertNotNull(hashTable.get(new Key("key1")));
        hashTable.delete(createEntry("key1", "value1"));
        Assert.assertNull(hashTable.get(new Key("key1")));
    }

    @Test
    public void testDelete_withResize() throws Exception {
        for (int i = 4; i < 32; ++i) {
            hashTable.put(createEntry("key" + i, "value" + i));
            Assert.assertNotNull(hashTable.get(new Key("key" + i)));
        }

        for (int i = 4; i < 32; ++i) {
            hashTable.delete(createEntry("key" + i, "value" + i));
            Assert.assertNull(hashTable.get(new Key("key" + i)));
        }
    }

    @Test
    public void testDeleteByKey() throws Exception {
        Assert.assertNotNull(hashTable.get(new Key("key1")));
        hashTable.deleteByKey(new Key("key1"));
        Assert.assertNull(hashTable.get(new Key("key1")));
    }

    @Test
    public void testDeleteByKey_withResize() throws Exception {
        for (int i = 4; i < 32; ++i) {
            hashTable.put(createEntry("key" + i, "value" + i));
            Assert.assertNotNull(hashTable.get(new Key("key" + i)));
        }

        for (int i = 4; i < 32; ++i) {
            hashTable.deleteByKey(new Key("key" + i));
            Assert.assertNull(hashTable.get(new Key("key" + i)));
        }
    }

    @Test
    public void testContains() throws Exception {
        Assert.assertTrue(hashTable.contains(new Key("key1")));
        Assert.assertFalse(hashTable.contains(new Key("key4")));
    }

    @Test
    public void testClear() throws Exception {
        Assert.assertNotNull(hashTable.get(new Key("key1")));
        hashTable.clear();
        Assert.assertNull(hashTable.get(new Key("key1")));
    }

    private static Node createEntry(String key, String value) {
        Node entry = new Node();
        entry.setKey(new Key(key));
        entry.setValue(new Value(value));

        return entry;
    }
}
