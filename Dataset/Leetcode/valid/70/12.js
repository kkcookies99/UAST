var XXX = function(n) {
    // dp[i] 为第 i 阶楼梯有多少种方法爬到楼顶
    // dp[i] = dp[i - 1] + dp[i - 2]
    let dp = [1 , 2]
    for(let i = 2; i < n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }
    return dp[n - 1]
};

