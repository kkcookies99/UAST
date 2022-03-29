class Solution {
    public int XXX(int m, int n) {
        int[] dp = new int[n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0) {
                    dp[j] = 1;
                    continue;
                }
                dp[j] = dp[j - 1] + dp[j];
            }
        }
        return dp[n - 1];
    }
}
