 class Solution {
public:
    // 1.dp数组下标及值含义:从起点到[i, j]处的路径总数
    // 2.dp数组递推式:dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
    // 3.dp数组初始化:dp[i][0] = dp[0][j] = 1
    // 4.遍历顺序:两层for循环, 上至下，左至右
    // 5.举例推导dp数组, 判断合理性
    int XXX(int m, int n) {
        vector<vector<int>> dp(m, vector<int>(n, 1));
        for(int i = 1; i < m; ++i)
            for(int j = 1; j < n; ++j)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        return dp[m - 1][n - 1];
    }
};

