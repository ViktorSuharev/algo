package com.visu.algo.fibonacci;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class RecursiveLambdaFibonacci implements Fibonacci {

    @Override
    public List<Integer> getSequence(int n) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                .limit(n)
                .map(i -> i[0])
                .collect(toList());
    }
}
