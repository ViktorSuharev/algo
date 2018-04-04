package com.visu.algo.array.kmax.linear;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KMaxElementsWithoutRepeatedFinder extends KMaxElementsFinder {

    @Override
    protected List<Integer> initPool(List<Integer> list, int k) {
        Set<Integer> maxSet = new HashSet<>();

        for (int i = 0; i < k; ++i) {
            maxSet.add(list.get(i));
        }

        List<Integer> maxList = new ArrayList<>(maxSet);
        maxList.sort(Comparator.reverseOrder());

        return maxList;
    }

    @Override
    protected boolean isNeededToInsert(List<Integer> sortedList, int value) {
        return isMeetInterval(sortedList, value) && !contains(sortedList, value);
    }

    private boolean contains(List<Integer> sortedList, int value) {
        return sortedList.stream()
                .anyMatch(k -> k == value);
    }
}
