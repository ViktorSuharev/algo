package com.visu.algo.structure.heap;

import java.util.Objects;

public class Key {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key1 = (Key) o;
        return Objects.equals(value, key1.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}
