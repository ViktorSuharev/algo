package com.visu.algo.structure.stack;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stackContent = new LinkedList<>();
    private LinkedList<Integer> maxElementsByCount = new LinkedList<>();

    public void push(Integer obj) {
        stackContent.addLast(obj);

        int max = !maxElementsByCount.isEmpty() && maxElementsByCount.getLast() > obj ?
                maxElementsByCount.getLast() : obj;
        maxElementsByCount.addLast(max);
    }

    public Integer pop() {
        if (stackContent.isEmpty()) return null;

        Integer obj = stackContent.getLast();
        stackContent.removeLast();
        maxElementsByCount.removeLast();

        return obj;
    }

    public Integer max() {
        if (maxElementsByCount.isEmpty()) return null;

        return maxElementsByCount.getLast();
    }

    public void clear() {
        stackContent.clear();
        maxElementsByCount.clear();
    }

    public int size() {
        return stackContent.size();
    }
}
