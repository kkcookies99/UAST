class Solution {
public:
    // 背包容量是n, 有无数种1阶和2阶台阶(商品), 求装满背包的排列总数
    int XXX(int n) {
        vector<int> dp(n + 1, 0);
        dp[0] = 1;
        // 求排列总数, 先遍历背包
        for(int j = 0; j <= n; ++j)
            for(int i = 1; i <= 2; ++i)
                if(j >= i)
                    dp[j] += dp[j - i];
        return dp.back();
    }
};

