package com.visu.algo.structure.hash.model;

public class HashEntry {

    private Key key;
    private Value value;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

