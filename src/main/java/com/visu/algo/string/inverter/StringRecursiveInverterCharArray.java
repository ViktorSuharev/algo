package com.visu.algo.string.inverter;

public class StringRecursiveInverterCharArray {

    public String invert(String str) {
        return invert(str.toCharArray(), 0);
    }

    private String invert(char[] str, int index) {
        if (index == str.length / 2) {
            return String.valueOf(str);
        }

        swap(str, index, str.length - 1 - index);
        return invert(str, ++index);
    }

    private void swap(char[] str, int a, int b) {
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }
}