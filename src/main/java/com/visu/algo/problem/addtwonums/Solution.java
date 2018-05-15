package com.visu.algo.problem.addtwonums;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        int sum = 0;
        int rest = 0;
        while (l1 != null || l2 != null) {
            int l1Value = getValue(l1.next);
            int l2Value = getValue(l2.next);

            sum = l1Value + l2Value + rest;
            rest = sum / 10;
            ListNode node = new ListNode(sum % 10);

            if (result == null) result = node;
            else result.next = node;
        }
        if (rest != 0) result.next = new ListNode(1);

        return result;
    }

    private int getValue(ListNode node) {
        return node == null ? 0 : node.val;
    }
}
