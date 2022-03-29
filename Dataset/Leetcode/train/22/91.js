 var XXX = function(n) {
    // 问题转移方程
    // dp[n] = (dp[n-1])dp[0], (dp[n-2])dp[1], (dp[n-3])dp[2] .....
    const dp = [[''], ['()']];
    const generate = n => {
        if(dp[n]) return dp[n];
        const result = [];
        for (const key of Array(n).fill().keys()) {
            const left = generate(n - key - 1)
                .map(item => `(${item})`);
            const current = generate(key)
                .map(right => left.map(leftPart => {
                    result.push(`${leftPart}${right}`)
                }));
        }
        dp[n] = result;
        return result;
    }

    return generate(n);
};


