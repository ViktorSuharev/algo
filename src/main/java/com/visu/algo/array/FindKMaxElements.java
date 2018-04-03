package com.visu.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindKMaxElements {

    public static void main(String[] args) {
        List<Integer> max = find(Arrays.asList(11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11), 10);
        System.out.println(max);
    }

    public static List<Integer> find(List<Integer> list, int k) {
        if (list.size() <= k) {
            return list;
        }

        List<Integer> max = initPool(list, k);
        proceed(max, list, k);

        return max;
    }

    private static List<Integer> initPool(List<Integer> list, int k) {
        List<Integer> max = new ArrayList<>();

        for (int i = 0; i < k; ++i) {
            max.add(list.get(i));
        }
        max.sort(Comparator.reverseOrder());

        return max;
    }

    private static void proceed(List<Integer> max, List<Integer> list, int k) {
        for (int i = k; i < list.size(); ++i) {
            insertIfNeeded(max, list.get(i));
        }
    }

    private static void insertIfNeeded(List<Integer> sortedList, int value) {
        if (!isMeetInterval(sortedList, value)) {
            return;
        }


    }

    private static boolean isMeetInterval(List<Integer> sortedList, int value) {
        return sortedList.get(0) < value;
    }

    private static int addValueToPool(List<Integer> sortedList, int value) {
        for (int i = 0; i < sortedList.size(); ++i) {
            if (sortedList.get(i) < value) {

                

                addValueToPool(sortedList, value, i);
            }
        }
    }

    private static int addValueToPool(List<Integer> sortedList, int value, int pos) {
        for () {

        }
    }

    private static int binarySearch(List<Integer> sortedList, int value) {
        return 0;
    }
}
