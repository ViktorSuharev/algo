package com.visu.algo.array.kmax.linear;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KMaxElementsFinder {

    private static final int OUT_OF_RANGE = -1;

    public List<Integer> find(List<Integer> list, int k) {
        if (list.size() <= k) {
            return list;
        }

        List<Integer> initialElements = initPool(list, k);
        proceed(initialElements, list, k);

        return initialElements;
    }

    protected List<Integer> initPool(List<Integer> list, int k) {
        List<Integer> max = new ArrayList<>();

        for (int i = 0; i < k; ++i) {
            max.add(list.get(i));
        }
        max.sort(Comparator.reverseOrder());

        return max;
    }

    private void proceed(List<Integer> max, List<Integer> list, int k) {
        for (int i = k; i < list.size(); ++i) {
            insertIfNeeded(max, list.get(i));
        }
    }

    protected void insertIfNeeded(List<Integer> sortedList, int value) {
        if (isNeededToInsert(sortedList, value)) {
            addValueToPool(sortedList, value);
        }
    }

    protected boolean isNeededToInsert(List<Integer> sortedList, int value) {
        return isMeetInterval(sortedList, value);
    }

    protected boolean isMeetInterval(List<Integer> sortedList, int value) {
        return sortedList.get(sortedList.size() - 1) < value;
    }

    private void addValueToPool(List<Integer> sortedList, int value) {
        int positionToInsert = getPositionByLinearSearch(sortedList, value);
        for (int i = sortedList.size() - 1; i > positionToInsert; --i) {
            sortedList.set(i, sortedList.get(i - 1));
        }
        sortedList.set(positionToInsert, value);
    }

    private int getPositionByLinearSearch(List<Integer> sortedList, int value) {
        for (int i = 0; i < sortedList.size(); ++i) {
            if (sortedList.get(i) < value) {
                return i;
            }
        }

        return OUT_OF_RANGE;
    }

    protected int binarySearch(List<Integer> sortedList, int value) {
        return 0;
    }
}
