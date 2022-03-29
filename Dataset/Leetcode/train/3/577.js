 var XXX = function(s) {
    let dp = [],
        len = s.length;
    if (len === 0) return 0
    dp[0] = 1;
    for (let i = 1; i < len; i++) {
        let hasSameString = false
        for (let j = i - 1; j >= 0; j--) {
           if (s[i] == s[j]) {
               dp[i] = j == (i - 1) ? 1 : Math.min(dp[i-1]+1, i - j);
               hasSameString = true;
               break;
           }
        }
        if (!hasSameString) {
            dp[i] = dp[i-1] + 1;
        }

    }
    return Math.max.apply(null, dp)
};

