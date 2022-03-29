 class Solution {
    public int XXX(int m, int n) {
        // 位于第i，j位置的路径条数等于它上面格子的路径条数+它左边格子的路径条数
        if(m == 0 || n == 0) return 0;

        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 0; i < m; i++) { // 计算第n行数据
            for(int j = 0; j < n; j++) { // 计算第j个格子
                dp[j] = j == 0 ? dp[j] : dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}```

