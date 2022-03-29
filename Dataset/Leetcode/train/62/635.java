class Solution {
    public int XXX(int m, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for(int i = 1 ;i < m ;i++){
            for (int j = 1; j < dp.length; j++) {
                dp[j] = dp[j] +dp[j-1];
            }
        }
        return dp[n-1];
    }
}

