 class Solution {
    public String XXX(String s) {
        int left = 0;
        int right = 0;
        int ans = 0;
        int start = 0;
        int len = 1;
        for (int i = 0; i < s.length(); i++) {
            len = 1;
            left = i - 1;
            right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                left--;
                len++;
            }
            while (right < s.length() && s.charAt(i) == s.charAt(right)) {
                right++;
                len++;
            }
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                right++;
                left--;
                len += 2;
            }
            if (ans < len) {
                ans = len;
                start = left+1;
            }
        }
        return s.substring(start, start + ans);
    }
}

