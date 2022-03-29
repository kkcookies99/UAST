class Solution {
    public int XXX(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] =  dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

