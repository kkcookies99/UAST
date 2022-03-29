 class Solution {
    public String XXX(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int lo = 0, hi = 0, result = 0;

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) dp[i][j] = true;
                    else if (dp[i + 1][j - 1]) dp[i][j] = true;
                }
                if (dp[i][j] == true && (j - i) > result) {
                    result = j - i;
                    lo = i;
                    hi = j;
                }
            }
        }

        return s.substring(lo, hi + 1);
    }
}

