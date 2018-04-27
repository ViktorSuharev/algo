package com.visu.algo.string.palindrom;

public class PalindromeResolver {

    public boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (!isAlphabeticOrNumeric(arr[left])) {
                left++;
                continue;
            }

            if (!isAlphabeticOrNumeric(arr[right])) {
                right--;
                continue;
            }

            if (!isEqual(arr[left], arr[right])) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphabeticOrNumeric(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }

    private boolean isEqual(char a, char b) {
        return Character.toLowerCase(a) == Character.toLowerCase(b);
    }
}
