 class Solution {
    public int XXX(int m, int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<n;j++){
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return dp[n-1];
    }
}

