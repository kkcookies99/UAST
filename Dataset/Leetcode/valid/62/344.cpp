 class Solution {
public:
  // 二维DP：(Bottom-Up)
  int XXX(int m, int n) {
    vector<vector<int>> dp(m, vector<int>(n, 1));
    for (int i = 1; i < m; ++i)
      for (int j = 1; j < n; ++j)
        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];

    return dp[m - 1][n - 1];
  }

  // Recursion with memorization (Top-Down)
  int XXXII(int m, int n) {
    memo_ = vector<vector<int>>(m, vector<int>(n, -1));
    return XXX(m, n, 0, 0);
  }

private:
  vector<vector<int>> memo_;

  int XXX(int m, int n, int x, int y) {
    if (x == n or y == m)          return 0;
    if (x == n - 1 and y == m - 1) return 1;
    if (memo_[y][x] >= 0)          return memo_[y][x];
    return memo_[y][x] = XXX(m, n, x + 1, y) +
                         XXX(m, n, x, y + 1);
  }
};

