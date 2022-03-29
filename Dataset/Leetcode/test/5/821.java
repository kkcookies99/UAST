 class Solution {

    private int start = 0, maxLen = 0;

    public String XXX(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1);
        }

        return s.substring(start, start + maxLen);
    }

    private void extendPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        if (maxLen < j - i - 1) {
            start = i + 1;
            maxLen = j - i - 1;
        }
    }
}
