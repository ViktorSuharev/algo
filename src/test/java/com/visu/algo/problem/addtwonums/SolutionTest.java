package com.visu.algo.problem.addtwonums;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void addTwoNumbers_withoutTransfer() {
        ListNode l1 = createList(323);
        ListNode l2 = createList(554);
        print(l1);
        print(l2);
        ListNode expected = createList(877);
        print(expected);
        ListNode result = solution.addTwoNumbers(l1, l2);
        print(result);
        Assert.assertTrue(equals(expected, result));
    }

    @Test
    public void addTwoNumbers_withTransfer() {
        ListNode l1 = createList(323);
        ListNode l2 = createList(954);
        print(l1);
        print(l2);
        ListNode expected = createList(1277);
        print(expected);
        ListNode result = solution.addTwoNumbers(l1, l2);
        print(result);
        Assert.assertTrue(equals(expected, result));
    }

    private boolean equals(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null || l1 != null && l2 == null) return false;
        if (l1 == null && l2 == null) return true;
        if (l1.val != l2.val) return false;

        return equals(l1.next, l2.next);
    }

    private ListNode createList(int num) {
        ListNode result = new ListNode(num % 10);
        ListNode current;
        ListNode prev = result;
        num = num / 10;
        while (num != 0) {
            current = new ListNode(num % 10);
            prev.next = current;
            num = num / 10;
            prev = current;
        }

        return result;
    }

    private void print(ListNode listNode) {
        if (listNode == null) {
            System.out.println();
            return;
        }

        System.out.print(listNode.val + " ");
        print(listNode.next);
    }
}