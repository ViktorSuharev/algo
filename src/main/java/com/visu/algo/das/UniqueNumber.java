package com.visu.algo.das;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueNumber {

    public static void main (String[] args) throws java.lang.Exception {
        Set<Integer> set = new HashSet<>();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; ++i) {
            set.add(s.nextInt());
        }
        s.close();

        System.out.println(set.size());
    }
}