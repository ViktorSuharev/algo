package com.visu.algo.structure.cache.model;

import com.visu.algo.structure.cache.LruCache;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LruCacheImplTest {

    private final LruCache cache = new LruCacheImpl(6);

    @Before
    public void setUp() {
        cache.clear();
    }

    @Test
    public void get() {
        fulfillCacheData();
        Assert.assertEquals(new Value("2"), cache.get(new Key("2")));
    }

    @Test
    public void get_notExist() {
        fulfillCacheData();
        Assert.assertEquals(null, cache.get(new Key("0")));
    }

    @Test
    public void put_first() {
        Key key = new Key("0");
        Value value = new Value("0");

        cache.put(key, value);
        Assert.assertEquals(value, cache.get(key));
    }

    @Test
    public void put_notOverflow() {
        fulfillCacheData();
        Assert.assertEquals(new Value("5"), cache.get(new Key("5")));
    }

    @Test
    public void put_overflow() {
        fulfillCacheData();
        cache.put(new Key("6"), new Value("6"));
        cache.put(new Key("7"), new Value("7"));
        Assert.assertEquals(null, cache.get(new Key("1")));
        Assert.assertEquals(new Value("7"), cache.get(new Key("7")));
    }

    private void fulfillCacheData() {
        cache.put(new Key("1"), new Value("1"));
        cache.put(new Key("2"), new Value("2"));
        cache.put(new Key("3"), new Value("3"));
        cache.put(new Key("4"), new Value("4"));
        cache.put(new Key("5"), new Value("5"));
    }
}