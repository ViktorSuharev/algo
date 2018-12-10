package com.visu.algo.problem.rangesumofbst;

public class RangeSumOfBst {

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (root.val >= L && root.val <= R) {
            sum = root.val;
        }

        if (root.val > L && root.left != null) {
            sum = sum + rangeSumBST(root.left, L, R);
        }

        if (root.val < R && root.right != null) {
            sum = sum + rangeSumBST(root.right, L, R);
        }

        return sum;
    }
}
