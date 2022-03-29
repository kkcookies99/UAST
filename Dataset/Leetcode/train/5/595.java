 class Solution {
    public String XXX(String s) {
        int maxLen = 0;
        String ans = "";
        for (int i = 0; i < 2 * s.length() - 1; ++i) {
            int left = i / 2, right = (i + 1) / 2;
            while (left > -1 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLen) {
                    ans = s.substring(left, right + 1);
                    maxLen = right - left + 1;
                }
                left--;
                right++;
            }
        }
        return ans;
    }
}

