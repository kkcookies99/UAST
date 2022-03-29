 class Solution {
public:
    int XXX(int m, int n) {
        //最朴素的做法
        /*
        vector<vector<int>> dp(m, vector<int>(n, 0));
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
        */
        //分析以后可以看出只需要一维数组就可以解决
        //分析就是当前格子的方法数 等于上一行格子的加上左边格子的，我们用一维数组来存储上一行的值，又因为左边都是从1开始
        vector<int> dp(n, 0);
        dp[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return dp[n-1];
    }
};

