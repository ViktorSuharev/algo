package com.visu.algo.string.palindrome;

public class RecursivePalindromeResolver implements PalindromeResolver {

    @Override
    public boolean isPalindrome(String str) {
        return str != null
                && (str.length() < 2 || resolve(str));
    }

    private boolean resolve(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (!isAlphabeticOrNumeric(arr[left])) left++;
        while (!isAlphabeticOrNumeric(arr[right])) right--;
        if (!isEqual(arr[left++], arr[right--])) return false;

        return left >= right || isPalindrome(str.substring(left, right + 1));
    }

    private boolean isAlphabeticOrNumeric(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }

    private boolean isEqual(char a, char b) {
        return Character.toLowerCase(a) == Character.toLowerCase(b);
    }
}
