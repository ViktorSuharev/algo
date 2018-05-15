package com.visu.algo.problem.addtwonums;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void addTwoNumbers() {
        Assert.assertTrue(
                equals(
                        createList(7721),
                        solution.addTwoNumbers(createList(323), createList(459))
                )
        );
    }

    private boolean equals(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null || l1 != null && l2 == null) return false;
        if (l1 == null && l2 == null) return true;
        if (l1.val != l2.val) return false;

        return equals(l1.next, l2.next);
    }

    private ListNode createList(int num) {
        ListNode result = new ListNode(num % 10);
        num = num / 10;
        while (num != 0) {
            result.next = new ListNode(num % 10);
            num = num / 10;
        }

        return result;
    }
}