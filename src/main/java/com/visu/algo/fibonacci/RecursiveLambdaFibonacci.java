package com.visu.sandbox.algo.fibonacci;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class RecursiveLambdaFibonacci {

    public static void main(String[] args) {
        System.out.println(RecursiveLambdaFibonacci.generate(10));
    }

    public static List<Integer> generate(int series) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(series)
                .map(n -> n[0])
                .collect(toList());
    }
}
