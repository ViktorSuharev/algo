package com.visu.algo.structure.heap.list.model.key;

public class KeyImpl extends AbstractKey implements Key {

    private int value;

    public KeyImpl(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int compareTo(KeyImpl keyImpl) {
        return Integer.compare(value, keyImpl.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyImpl keyImpl = (KeyImpl) o;

        return value == keyImpl.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
