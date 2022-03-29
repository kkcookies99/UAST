class Solution {
    public int XXX(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i <= 3) {
                dp[i] = i;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
}

