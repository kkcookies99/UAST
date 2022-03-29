 class Solution {
    private int begin = 0, end = 0; // 用于记录最长回文子串的头和尾
    public String XXX(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            findPalindrome(s, n, i - 1, i + 1); // 寻找长度为奇数的回文子串
            findPalindrome(s, n, i, i + 1); // 寻找长度为偶数的回文子串
        }
        return s.substring(begin, end + 1);
    }

    private void findPalindrome(String s, int n, int l, int r) {
        while (l >= 0 && r < n) {
            if (s.charAt(l) == s.charAt(r)) {
                int b = l, e = r;
                if ((e - b) > (end - begin)) { // if ((e - b + 1) > (end - begin + 1))
                    begin = b;
                    end = e;
                }
                --l;
                ++r;
            } else {
                break;
            }
        }
    }
}

