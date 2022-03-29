class Solution {
    public int XXX(int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[0] = 1; continue;
            }
            if (i == 1) {
                dp[1] = 2; continue;
            }
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}

