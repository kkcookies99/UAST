class Solution {
    public int XXX(int m, int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j] = dp[j - 1] + dp[j];
            }
        }
        return dp[n];
    }
}

