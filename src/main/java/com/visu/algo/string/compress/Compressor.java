package com.visu.algo.string.compress;

public class Compressor {

    public String compress(String str) {
        if (str == null || str.isEmpty()) return "";

        StringBuilder res = new StringBuilder();
        char[] arr = str.toCharArray();

        int counter = 1;
        char prev = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == prev) {
                counter++;
            } else {
                res.append(prev);
                if (counter > 1) res.append(counter);
                counter = 1;
            }
            prev = arr[i];
        }
        res.append(prev);
        if (counter > 1) res.append(counter);

        return res.toString();
    }
}
