class Solution {
public:
    long long dp[105][105];
    long long func(long long x, long long y) {
         if(x < 0 || y < 0) return 0; 
        if(x == 0 || y == 0) return 1;
        if(dp[x][y]) return dp[x][y];
        dp[x][y] = func(x - 1, y) + func(x, y - 1);
        return dp[x][y];
    }
    int XXX(int m, int n) {
           return func(m - 1, n - 1);
    }
};

