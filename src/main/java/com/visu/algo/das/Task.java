package com.visu.algo.das;

import java.util.ArrayList;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(0, 0);
        nums.add(1, 3);
        nums.add(2, 7);
        for (int i = 3; i <= 16; ++i) {
            nums.add(i, 3 * nums.get(i - 1) - 2 * nums.get(i - 2));
        }

        for (int i = 1; i <= 16; ++i)
            System.out.println(nums.get(i));
    }
}
