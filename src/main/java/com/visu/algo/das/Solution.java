package com.visu.algo.das;

import java.util.Scanner;

public class Solution {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();
        s.close();

        if (k == 0 || k == n) {
            System.out.println(1);
        } else {
            int num = getCnk(n, k);
            int sum = getDivSum(num);
            System.out.println(sum);
        }
    }

    private static int getCnk(int n, int k) {
        int res = 1;
        int max = k > n - k ? k : n - k;
        for (int i = max + 1; i <= n; ++i) {
            res = res * i;
        }

        return res / factorial(n - max);
    }

    private static int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    private static int getDivSum(int n) {
        int sum = n + 1;

        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; ++i) {
            if (n % i == 0) {
                if (n == sqrt * sqrt) return sum + sqrt;

                sum = (sum + i + n / i) % 1000000007;
            }
        }

        return sum;
    }
}
