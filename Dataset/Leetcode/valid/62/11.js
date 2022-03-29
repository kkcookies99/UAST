 var XXX = function(m, n) {
    const dp = Array(m).fill().map(item => Array(n))
    
    for (let i = 0; i < m; ++i) {
        dp[i][0] = 1
    }
    
    for (let i = 0; i < n; ++i) {
        dp[0][i] = 1
    }
    
    for (let i = 1; i < m; ++i) {
        for (let j = 1; j < n; ++j) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        }
    }
    return dp[m - 1][n - 1]
};

