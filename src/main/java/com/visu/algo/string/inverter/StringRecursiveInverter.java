package com.visu.algo.string.inverter;

public class StringRecursiveInverter {

    public String invert(String str) {
        if (str.length() <= 1) {
            return str;
        }

        return str.charAt(str.length() - 1) + invert(str.substring(1, str.length() - 1)) + str.charAt(0);
    }
}
