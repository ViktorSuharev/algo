package com.visu.algo.search;

public class LinearSearcher implements Searcher {

    private static final int ELEMENT_NOT_FOUND = -1;

    @Override
    public int search(double[] elements, double xElement) {
        for (int i = 0; i < elements.length; ++i) {
            if (elements[i] == xElement) {
                return i;
            }
        }

        return ELEMENT_NOT_FOUND;
    }
}
