 class Solution {
    public String XXX(String str) {
        int n = str.length();
        if (n < 2) {
            return str;
        }

        int maxLen = 1;
        int begin = 0;

        boolean[][] dp = new boolean[n][n];

        char[] chs = str.toCharArray();
        for (int i = 0; i < n; ++i) {
            dp[i][i] = true;
            for (int j = 0; j < i; ++j) { // [j,i]
                dp[j][i] = (chs[j] == chs[i] && (j + 1 > i - 1 || dp[j + 1][i - 1]));
                if (dp[j][i] && maxLen < (i - j + 1)) {
                    maxLen = i - j + 1;
                    begin = j;
                }
            }
        }

        return str.substring(begin, begin + maxLen);
    }
}

