var XXX = function(m, n) {
    const dp = new Array(m);

    for(let i = 0; i < m; i++) {
        const tmp = new Array(n);
        tmp[0] = 1;    // 第一列，路径都为1
        if (i === 0) {   // 第一行，路径都为1
            for(let j = 1; j < n; j++) {
                tmp[j] = 1;
            }
        }
        dp[i] = tmp;
    }

    for(let i = 1; i < m; i++) {
        for(let j = 1; j < n; j++) {
            dp[i][j] = dp[i-1][j] + dp[i][j-1];
        }
    }

    return dp[m-1][n-1];
}

