package com.visu.algo.string.compress;

public class IntCompressor {


    /**
     * input  1 2 3 4 5 7 9 10 11 13 14
     * output 1-5,7,8-11,13-14
     */
    public String compress(int[] arr) {
        if (arr == null || arr.length == 0) return "";

        StringBuilder res = new StringBuilder();

        char delimiter = (arr[0] == arr[1] - 1) ? '-' : ',';
        res.append(arr[0]).append(delimiter);

        for (int i = 1; i < arr.length - 1; ++i) {

            // single elem or end of seq
            if (arr[i] != arr[i + 1] - 1) {
                res.append(arr[i]).append(",");
            }

            // start of seq
            if (arr[i] != arr[i - 1] + 1 && arr[i] == arr[i + 1] - 1) {
                res.append(arr[i]).append('-');
            }

        }
        res.append(arr[arr.length - 1]);

        return res.toString();
    }

}
