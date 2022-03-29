class Solution {
    public int XXX(int n) {
        int[] dp = new int[2];
        dp[0] = 1; dp[1] = 2;int sum;
        for (int i = 2; i < n; i++) {
            sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        return dp[1];
    }
}

