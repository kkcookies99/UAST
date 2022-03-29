 class Solution {
    public String XXX(String s) {
        if (s.length() < 2) return s;
        return dynamicProgramming(s);
    }

    private String dynamicProgramming(String s) {
        int start = 0, end = 0, maxLength = 1;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int right = 1; right < s.length(); right++) {
            for (int left = 0; left < right; left++) {
                //right-left<=2：如果只有三个字符，且两端相等，则不需要判断最里层就知道是回文 aba
                if (s.charAt(right) == s.charAt(left) && (right - left <= 2 || dp[left + 1][right - 1])) {
                    dp[left][right] = true;
                    if (right - left + 1 > maxLength) {
                        start = left;
                        maxLength = right - left + 1;
                        end = right;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}

