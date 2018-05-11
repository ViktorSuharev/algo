package com.visu.algo.string.compress;

public class CharCompressor {

    /**
     * input  aaabbcdde
     * output a3b2cd2e
     */
    public String compress(String str) {
        if (str == null || str.isEmpty()) return "";

        StringBuilder res = new StringBuilder();
        char[] arr = str.toCharArray();

        int counter = 1;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == arr[i - 1]) {
                counter++;
            } else {
                res.append(arr[i - 1]);
                if (counter > 1) res.append(counter);
                counter = 1;
            }
        }
        res.append(arr[arr.length - 1]);
        if (counter > 1) res.append(counter);

        return res.toString();
    }
}
