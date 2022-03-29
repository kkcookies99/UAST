 class Solution {
    public String XXX(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        int beginIdx = 0, len = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (j - i + 1 > len && isPalindrome(s, i, j)) {
                    len = j - i + 1;
                    beginIdx = i;
                }
            }
        }
        return s.substring(beginIdx, beginIdx + len);
    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

