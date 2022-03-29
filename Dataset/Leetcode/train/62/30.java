 class Solution {
    public int XXX(int m, int n) {
        int[] dp = new int[n];
        //初始化第1行和第1列
        Arrays.fill(dp, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //当前行dp[j]=上一行dp[j]+当前行dp[j-1]
                dp[j] += dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}

