 class Solution {
public:
    // 1.dp[i][j]:若[i, j]为回文子串, 则为其长度, 否则为0
    // 2.若dp[i + 1][j - 1]!=0, 且s[i] == s[j], dp[i][j] = dp[i + 1][j - 1] + 2
    //   否则, dp[i][j] = 0
    // 3.初始化:dp[i][i] = 1,其他为0
    // 4.遍历顺序:i:n-1 ~ 0, j:i+1 ~ n-1
    // 5.举例推导dp数组, 判断合理性
    string XXX(const string& s) {
        int n = s.size();
        vector<vector<int>> dp(n, vector<int>(n, 0));
        for(int i = 0; i < n; ++i)
            dp[i][i] = 1;
        for(int i = n - 1; i >= 0; --i)
            for(int j = i + 1; j < n; ++j) {
                if(dp[i + 1][j - 1] && s[i] == s[j] && j > i + 1)
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                else if(j == i + 1 && s[i] == s[j])
                    dp[i][j] = 2;
            }
        // <value, 区间>
        pair<int, pair<int, int>> res = {0, {-1, -1}};
        for(int i = 0; i < n; ++i)
            for(int j = i; j < n; ++j)
                if(res.first < dp[i][j])
                    res = {dp[i][j], {i, j}};
        int l = res.second.first, r = res.second.second;
        return s.substr(l, r - l + 1);
    }
};

