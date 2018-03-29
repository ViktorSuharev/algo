package com.visu.algo.search.binary;

public class BinarySearcher {

    private static final int ELEMENT_NOT_FOUND = -1;

    public int binarySearch(double[] elements, double xElement) {
        return search(elements, 0, elements.length - 1, xElement);
    }

    private int search(double[] elements, int left, int right, double xElement) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (elements[mid] == xElement) return mid;
            else if (elements[mid] > xElement) return search(elements, left, mid - 1, xElement);
            else return search(elements, mid + 1, right, xElement);
        }

        return ELEMENT_NOT_FOUND;
    }
}
