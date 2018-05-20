package com.visu.algo.problem.addtwonums;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode prev = null;

        int sum = 0;
        int rest = 0;
        while (l1 != null || l2 != null) {
            int l1Value = getValue(l1);
            int l2Value = getValue(l2);

            sum = l1Value + l2Value + rest;
            rest = sum / 10;
            ListNode node = new ListNode(sum % 10);

            if (result == null) {
                result = node;
                prev = result;
            } else {
                prev.next = node;
                prev = node;
            }

            l1 = getNext(l1);
            l2 = getNext(l2);
        }
        if (rest != 0) prev.next = new ListNode(1);

        return result;
    }

    private int getValue(ListNode node) {
        return node == null ? 0 : node.val;
    }

    private ListNode getNext(ListNode node) {
        return node == null ? null : node.next;
    }
}
