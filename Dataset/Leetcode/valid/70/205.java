class Solution {
    public int XXX(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }
}

